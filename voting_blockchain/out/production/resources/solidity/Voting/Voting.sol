pragma solidity ^0.4.2;
pragma experimental ABIEncoderV2;

contract Voting{

    address public creator;
    bool public open;

    struct Voting_Cell{
        uint voting_cell_id;

        address[] candidates;
        uint[] allowed_voter_list;
        uint[] voted_voter_list;
        mapping(uint => address) allowed_id_address_map;
        mapping(uint => address) voted_id_address_map;

    }

    Voting_Cell[] public voting_cells;


    constructor(uint[][] allowed_voter_list, address[][] allowed_address_list, uint[] _voting_cell_ids, address[][] candidates) public{

        for (uint i=0; i<_voting_cell_ids.length; i++) {
            Voting_Cell voting_cell;
            voting_cell.voting_cell_id = _voting_cell_ids[i];
            voting_cell.candidates = candidates[i];
            voting_cell.allowed_voter_list = allowed_voter_list[i];

            for(uint j=0; j<voting_cell.allowed_voter_list.length; j++){
                voting_cell.allowed_id_address_map[allowed_voter_list[i][j]]=allowed_address_list[i][j];
            }

            voting_cells.push(voting_cell);
        }

        creator=msg.sender;
    }

  function open() public {
        if(creator == msg.sender){
        open = true;
        }
    }

    function close() public{
         if(creator == msg.sender){
                open = false;
                }
    }

    function allowed_to_vote(uint cell_id, uint voter_id) public view returns (bool) {
        if(voting_cells[cell_id].allowed_voter_list[voter_id]!=0){
            return true;
        }
        return false;
    }

    /*
    checks if the voter is allowed to vote
    if so, sends small amount of ether to candidates account
    */
    function vote(uint cell_id, uint voter_id, address candidate) public {
    Voting_Cell voting_cell = voting_cells[cell_id];

    if(open && voting_cell.voted_voter_list[voter_id]==0
            && voting_cell.allowed_voter_list[voter_id]!=0){

                candidate.transfer(1);
                voting_cell.voted_voter_list.push(voter_id);

            }
    }


}