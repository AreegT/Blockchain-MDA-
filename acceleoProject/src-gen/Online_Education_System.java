package acceleoProject.main;

import java.util.ArrayList;  
import java.util.List;

public class Online_Education_System
{
	private List<Block> blockchain =new ArrayList<>():
    public List<Block> getBlockChain(){
		return blockchain;
	}
	private Block getLatestBlock() {
		if(blockchain.isEmpty()){
			createGenesisBlock()
		}
		return blockchain.get(blockchain.size()-1);
	}
	private void createGenesisBlock() {
	blockchain.add(new Block("0","initial","0") );
	}
	public void addBlock(EString Data){
		Block previousBlock = getLatestBlock();
		Block newBlock = new Block(previousBlock.getBlock_No()+1,
		Data, previousBlock, getHash());
    	blockchain.add(newBlock);
	}
	public EBoolean isChainValid {
	 for (int i=1; i<blockchain.size(); i++) {
	 	Block currentBlock = blockchain.get(i);
		Block previousBlock = blockchain.get(i-1); 
		if(!currentBlock.getHash().equals(currentBlock.calculateHash()))	{
			return false;
		}
		if (!currentBlock.getPrev_Hash().equals(previousBlock.grtHash())) {
			return false;
		}
	}
	return true;
}
	public static void main(EString[] args){
	Online_Education_System edublock = new Online_Education_System();
		edublock.addBlock("Student Ali Information");
		edublock.addBlock("Student Saba Information");
		edublock.addBlock("Student Ahmed Information");
		edublock.addBlock("Student Sana Information");
		edublock.addBlock("Professor Dr. Farooque Information");
		edublock.addBlock("Professor Dr. Atif Information");
		edublock.addBlock("NUST University Information");
		edublock.addBlock("COMSATS University Information");
		edublock.addBlock("Encrypted Question");
	System.out.println(edublock.isChainValid());
	chain.getBlockChain().get(1).setData("5000");
	}
}



