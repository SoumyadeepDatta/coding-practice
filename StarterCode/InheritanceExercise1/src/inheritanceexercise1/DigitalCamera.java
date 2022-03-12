//lex_auth_012875034541367296266
//do not modify the above line

package inheritanceexercise1;

class DigitalCamera extends Camera {
	private int memory;

	public DigitalCamera(String brand, double cost) {
		this.memory = 16;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}

}
