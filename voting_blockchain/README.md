I've followed this tutorial on creating an ethereum account on testnet and getting ether
https://gist.github.com/cryptogoth/10a98e8078cfd69f7ca892ddbdcf26bc 
 
 took an access token from
 https://infura.io/ 
  
 and added the token and the path of account key to the code
 
 after that I've generated bin and abi files of smart contract
 by running in the terminal this command
 solc <contract>.sol --bin --abi --optimize -o <output-dir>
 
 then I've generated java class of solidity file based on bin and abi files
 using this web3j terminal call
 web3j solidity generate --javaTypes /path/to/<smart-contract>.bin  /path/to/<smart-contract>.abi
  -p  /path/to/your/choice/out/directory -o /path/to/src/main/java
  
  