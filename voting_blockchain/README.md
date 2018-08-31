Testing the waters:

I've followed this tutorial on creating an ethereum account on testnet and getting ether https://gist.github.com/cryptogoth/10a98e8078cfd69f7ca892ddbdcf26bc

took an access token from https://infura.io/

and added the token and the path of account key to the code

after that I've generated bin and abi files of smart contract by running in the terminal this command solc .sol --bin --abi --optimize -o

then I've generated java class of solidity file based on bin and abi files using this web3j terminal call web3j solidity generate --javaTypes /path/to/.bin /path/to/.abi -p /path/to/your/choice/out/directory -o /path/to/src/main/java

I was able to track transactions, smart contract deployment and state change in 'crypto faucet' section of https://rinkeby.io
