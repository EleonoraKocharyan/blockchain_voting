package contracts.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.4.0.
 */
public class Voting extends Contract {
    private static final String BINARY = "60806040523480156200001157600080fd5b5060405162000c2b38038062000c2b833981018060405262000037919081019062000631565b600080805b8451831015620002265784838151811015156200005557fe5b60209081029091010151825583518490849081106200007057fe5b602090810290910181015180516200008f926001860192019062000246565b5086838151811015156200009f57fe5b60209081029091018101518051620000be9260028601920190620002b0565b50600090505b600282015481101562000170578583815181101515620000e057fe5b9060200190602002015181815181101515620000f857fe5b9060200190602002015182600401600089868151811015156200011757fe5b90602001906020020151848151811015156200012f57fe5b60209081029190910181015182528101919091526040016000208054600160a060020a031916600160a060020a0392909216919091179055600101620000c4565b600180548082018083556000839052845460069092027fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf6810192835592850180549193869392620001e7927fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf79092019190620002fc565b5060028281018054620001fe92840191906200033f565b50600382810180546200021592840191906200033f565b5050600190940193506200003c9050565b505060008054600160a060020a03191633179055506200074e9350505050565b8280548282559060005260206000209081019282156200029e579160200282015b828111156200029e5782518254600160a060020a031916600160a060020a0390911617825560209092019160019091019062000267565b50620002ac92915062000382565b5090565b828054828255906000526020600020908101928215620002ee579160200282015b82811115620002ee578251825591602001919060010190620002d1565b50620002ac929150620003ac565b8280548282559060005260206000209081019282156200029e5760005260206000209182015b828111156200029e57825482559160010191906001019062000322565b828054828255906000526020600020908101928215620002ee5760005260206000209182015b82811115620002ee57825482559160010191906001019062000365565b620003a991905b80821115620002ac578054600160a060020a031916815560010162000389565b90565b620003a991905b80821115620002ac5760008155600101620003b3565b6000620003d7825162000742565b9392505050565b6000601f82018313620003f057600080fd5b815162000407620004018262000721565b620006fa565b915081818352602084019350602081019050838560208402820111156200042d57600080fd5b60005b838110156200045d5781620004468882620003c9565b845250602092830192919091019060010162000430565b5050505092915050565b6000601f820183136200047957600080fd5b81516200048a620004018262000721565b81815260209384019390925082018360005b838110156200045d5781518601620004b58882620003de565b84525060209283019291909101906001016200049c565b6000601f82018313620004de57600080fd5b8151620004ef620004018262000721565b81815260209384019390925082018360005b838110156200045d57815186016200051a888262000531565b845250602092830192919091019060010162000501565b6000601f820183136200054357600080fd5b815162000554620004018262000721565b915081818352602084019350602081019050838560208402820111156200057a57600080fd5b60005b838110156200045d578162000593888262000623565b84525060209283019291909101906001016200057d565b6000601f82018313620005bc57600080fd5b8151620005cd620004018262000721565b91508181835260208401935060208101905083856020840282011115620005f357600080fd5b60005b838110156200045d57816200060c888262000623565b8452506020928301929190910190600101620005f6565b6000620003d78251620003a9565b600080600080608085870312156200064857600080fd5b84516001604060020a038111156200065f57600080fd5b6200066d87828801620004cc565b94505060208501516001604060020a038111156200068a57600080fd5b620006988782880162000467565b93505060408501516001604060020a03811115620006b557600080fd5b620006c387828801620005aa565b92505060608501516001604060020a03811115620006e057600080fd5b620006ee8782880162000467565b91505092959194509250565b6040518181016001604060020a03811182821017156200071957600080fd5b604052919050565b60006001604060020a038211156200073857600080fd5b5060209081020190565b600160a060020a031690565b6104cd806200075e6000396000f3006080604052600436106100775763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166302d05d3f811461007c57806343d726d6146100a757806343eb1f4e146100be57806350d91583146100eb578063f59bec8c1461010b578063fcfff16f14610138575b600080fd5b34801561008857600080fd5b5061009161014d565b60405161009e9190610448565b60405180910390f35b3480156100b357600080fd5b506100bc610169565b005b3480156100ca57600080fd5b506100de6100d93660046103a0565b6101aa565b60405161009e9190610456565b3480156100f757600080fd5b506100bc6101063660046103da565b6101fc565b34801561011757600080fd5b5061012b61012636600461037a565b6102e0565b60405161009e9190610464565b34801561014457600080fd5b506100bc610304565b60005473ffffffffffffffffffffffffffffffffffffffff1681565b60005473ffffffffffffffffffffffffffffffffffffffff163314156101a8576000805474ff0000000000000000000000000000000000000000191690555b565b60006001838154811015156101bb57fe5b9060005260206000209060060201600201828154811015156101d957fe5b600091825260209091200154156101f2575060016101f6565b5060005b92915050565b600060018481548110151561020d57fe5b90600052602060002090600602019050600060149054906101000a900460ff16801561025357506003810180548490811061024457fe5b90600052602060002001546000145b801561027a57506002810180548490811061026a57fe5b9060005260206000200154600014155b156102da5760405173ffffffffffffffffffffffffffffffffffffffff83169060009060649082818181858883f193505050501580156102be573d6000803e3d6000fd5b5060038101805460018101825560009182526020909120018390555b50505050565b60018054829081106102ee57fe5b6000918252602090912060069091020154905081565b60005473ffffffffffffffffffffffffffffffffffffffff163314156101a8576000805474ff0000000000000000000000000000000000000000191674010000000000000000000000000000000000000000179055565b60006103678235610472565b9392505050565b60006103678235610490565b60006020828403121561038c57600080fd5b6000610398848461036e565b949350505050565b600080604083850312156103b357600080fd5b60006103bf858561036e565b92505060206103d08582860161036e565b9150509250929050565b6000806000606084860312156103ef57600080fd5b60006103fb868661036e565b935050602061040c8682870161036e565b925050604061041d8682870161035b565b9150509250925092565b61043081610472565b82525050565b6104308161048b565b61043081610490565b602081016101f68284610427565b602081016101f68284610436565b602081016101f6828461043f565b73ffffffffffffffffffffffffffffffffffffffff1690565b151590565b905600a265627a7a72305820ca4ff1ebc30d421e048f9276f4d1ec546d6c1feea6b614a28fd6ce11c10f6e956c6578706572696d656e74616cf50037";

    public static final String FUNC_CREATOR = "creator";

    public static final String FUNC_CLOSE = "close";

    public static final String FUNC_ALLOWED_TO_VOTE = "allowed_to_vote";

    public static final String FUNC_VOTE = "vote";

    public static final String FUNC_VOTING_CELLS = "voting_cells";

    public static final String FUNC_OPEN = "open";

    protected Voting(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Voting(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> creator() {
        final Function function = new Function(FUNC_CREATOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> close() {
        final Function function = new Function(
                FUNC_CLOSE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> allowed_to_vote(BigInteger cell_id, BigInteger voter_id) {
        final Function function = new Function(FUNC_ALLOWED_TO_VOTE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(cell_id), 
                new org.web3j.abi.datatypes.generated.Uint256(voter_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> vote(BigInteger cell_id, BigInteger voter_id, String candidate) {
        final Function function = new Function(
                FUNC_VOTE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(cell_id), 
                new org.web3j.abi.datatypes.generated.Uint256(voter_id), 
                new org.web3j.abi.datatypes.Address(candidate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> voting_cells(BigInteger param0) {
        final Function function = new Function(FUNC_VOTING_CELLS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> open() {
        final Function function = new Function(
                FUNC_OPEN, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, List<List<BigInteger>> allowed_voter_list, List<List<String>> allowed_address_list, List<BigInteger> _voting_cell_ids, List<List<String>> candidates) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(allowed_voter_list, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(allowed_address_list, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_voting_cell_ids, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(candidates, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.Address.class))));
        return deployRemoteCall(Voting.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, List<List<BigInteger>> allowed_voter_list, List<List<String>> allowed_address_list, List<BigInteger> _voting_cell_ids, List<List<String>> candidates) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(allowed_voter_list, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(allowed_address_list, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_voting_cell_ids, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray(
                        org.web3j.abi.Utils.typeMap(candidates, org.web3j.abi.datatypes.DynamicArray.class, org.web3j.abi.datatypes.Address.class))));
        return deployRemoteCall(Voting.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Voting load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Voting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
