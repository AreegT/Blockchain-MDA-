package acceleoProject.main;
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;
public class Block
{
//Every block contains Block No, Data, Hash, 
//Previous Hash and timestamp to determine the 
//moment in which block mined 
	private EString Hash;
	private EString Block_No;
	private EString Prev_Hash;
	private EString Data;
	private ELong Timestamp;
	
    public Block ( EString Block_No, EString Data,
	EString Prev_Hash)
	{
	this.Block_No = Block_No
	this.Data = Data;
	this.Prev_Hash = Prev_Hash;
	this.Timestamp = System.currentTimeMillis();
	this.Hash = calculateHash();
	}

	public EString getHash(){
		return this.Hash;
	}
	public void setHash(EString hash){
		Hash = hash 
	}
	public EString getBlock_No(){
		return this.Block_No;
	}
	public void setBlock_No(EString block_No){
		Block_No = block_No 
	}
	public EString getPrev_Hash(){
		return this.Prev_Hash;
	}
	public void setPrev_Hash(EString prev_Hash){
		Prev_Hash = prev_Hash 
	}
	public EString getData(){
		return this.Data;
	}
	public void setData(EString data){
		Data = data 
	}
	public ELong getTimestamp(){
		return this.Timestamp;
	}
	public void setTimestamp(ELong timestamp){
		Timestamp = timestamp 
	}

	public EString calculateHash()
	{
	EString text = EString.valueOf(Block_No + Prev_Hash +
    EString.valueOf(Timestamp) + EString.valueOf(Data)
	MessageDigest digest = null;
	try {
			digest = MessageDigest.getInstance("sha256")
	    	} catch (NoSuchAlgorithmException e) {
	// TODO Auto-generated catch block
			e.printStackTrace();
		}
	final EByte bytes[] = digest.digest(text.getbytes)
    final StringBuilder hexString = new StringBuilder();
	for(final EByte b :bytes){
  	EString hex= Integer.toHexString(0xff &b);
	if (hex.length() == 1) {
		hexString.append('0');
	}
	 hexString.append(hex);
	}
		return hexString.toString();	

	}
}


