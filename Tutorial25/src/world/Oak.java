package world;

public class Oak extends Plant {
	public Oak() {
		// Won't work -- type is private
		//type = "tree";
		
		// This works -- size is protected and oak is subclass of plant
		this.size = "large";
		
		// no access specifier; works because oak and plant in same package.
		this.height = 10;
	}

}
