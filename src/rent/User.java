package rent;

public class User implements Rent {
	
	Agency a =null;
	_58Net n = null;
	
	private int type;
	
	public User(int type) {
		this.type = type;
	}
	
	@Override
	public void lookFor() {
		
		if(this.type==1){
			if(a==null)
				a = new Agency();
			a.lookFor();
		}else if(this.type==2){
			if(n==null)
				n = new _58Net();
			n.lookFor();
		}
		
		
		
	}
	/*public void user(Object o) {
		if(o instanceof Agency) {
			 o = new Agency();
			 ((Agency) o).LookFor();
		}
		if(o instanceof _58Net) {
			 o = new _58Net();
			 ((_58Net) o).LookFor();
		}
	}
*/
	
}
