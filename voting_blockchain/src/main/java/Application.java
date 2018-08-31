
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import contracts.generated.Voting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;


public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        new Application().run();
    }

    private void run() throws Exception {

        // Infura token
        Web3j web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/cjMEdDTbza6vwFAqnfKM"));
        log.info("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        // generated wallet path, hardcoded :(
        Credentials credentials =
                WalletUtils.loadCredentials(
                        "notmyrealpassword",
                        "/Users/eleonorakocharyan/Library/Ethereum/rinkeby/keystore/UTC--2018-06-20T07-10-54.375304601Z--3b21cfd07ff9c14d1b522537578d9fbf598b48c6");
        log.info("Credentials loaded");


        // 'initializing' the voters (that are actually candidates too)
        String voter_1_address = "0x3b21cfd07ff9c14d1b522537578d9fbf598b48c6";
        String voter_2_address = "0x7d73aa783cf4079565991e9a4ea22daa9155906e";
        BigInteger voter_1_id = BigInteger.valueOf(1000);
        BigInteger voter_2_id = BigInteger.valueOf(1001);

        // creating the voting cells ids(in Armenia voting buildings are numerated as 0,1,2,3..)
        // that's why I pass the voters list of a specific voting cell just by adding it
        // in the corresponding cell id.
        // this is a kind of simulation of map, because I'm not able to pass map to a contract (as far as I know..)
        List<BigInteger> voting_cells = new LinkedList<>();
        voting_cells.add(BigInteger.valueOf(0));
        voting_cells.add(BigInteger.valueOf(1));

        // creating allowed voters list, which contains voter ids
        // it can be passport id etc..
        List<List<BigInteger>> allowed_voter_list = new LinkedList<>();
        List<BigInteger> allowed_voter_list_for_0_cell = Arrays.asList(voter_1_id);
        List<BigInteger> allowed_voter_list_for_1_cell = Arrays.asList(voter_2_id);

        allowed_voter_list.add(allowed_voter_list_for_0_cell);
        allowed_voter_list.add(allowed_voter_list_for_1_cell);

        // creating the allowed voter address list, which contains ethereum
        // addresses of the voters (this is not yet used in the voting process)
        List<List<String>> allowed_address_list = new LinkedList<>();
        List<String> allowed_address_list_for_0_cell = Arrays.asList(voter_1_address);
        List<String> allowed_address_list_for_1_cell = Arrays.asList(voter_2_address);

        allowed_address_list.add(allowed_address_list_for_0_cell);
        allowed_address_list.add(allowed_address_list_for_1_cell);

        // creating the list of candidates for every voting cell
        List<List<String>> candidates = new LinkedList<>();
        List<String> candidates_list_for_0_cell = Arrays.asList(voter_1_address, voter_2_address);
        List<String> candidates_list_for_1_cell = Arrays.asList(voter_1_address);
        candidates.add(candidates_list_for_0_cell);
        candidates.add(candidates_list_for_1_cell);

        // deploying the contract
        Voting contract = Voting.deploy(
                web3j, credentials,
                DefaultGasProvider.GAS_PRICE, DefaultGasProvider.GAS_LIMIT,
                allowed_voter_list, allowed_address_list, voting_cells,candidates).send();

        String contractAddress = contract.getContractAddress();
        log.info("Smart contract deployed to address " + contractAddress);
        log.info("Contract path -  https://rinkeby.etherscan.io/address/" + contractAddress);

        contract.open();

        //should count
        contract.vote(BigInteger.valueOf(0),voter_1_id,voter_1_address);

        //shouldn't count
        contract.vote(BigInteger.valueOf(0),voter_1_id,voter_2_address);

        contract.close();

        //should be true
        contract.allowed_to_vote(BigInteger.valueOf(1),voter_2_id);
        //shouldn't count
        contract.vote(BigInteger.valueOf(1),voter_2_id,voter_2_address);


    }
}
