package StatsUI;

public class Loadout {
	private String primary;
	private String secondary;
	private String leathal;
	private String loadoutName;
	private int numberOfPerks;
	
	public Loadout(String primary, String secondary, String leathal, String loadoutName, int numberOfPerks) {
		setPrimary(primary);
		setSecondary(secondary);
		setLeathal(leathal);
		setLoadoutName(loadoutName);
		setNumberOfPerks(numberOfPerks);
	}
	
	public String toString() {
		return getLoadoutName() + ": " + getPrimary() + ", " + getSecondary() + ", " + getLeathal() + ", " + getNumberOfPerks();
	}
	
	/**
	 * The primary weapon the player used
	 * @return the weapon used
	 */
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	
	/**
	 * The secondary weapon the player used 
	 * @return the weapon used
	 */
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	
	/**
	 * What type of grenade the player used
	 * @return what was used
	 */
	public String getLeathal() {
		return leathal;
	}
	public void setLeathal(String leathal) {
		this.leathal = leathal;
	}
	
	/**
	 * player's name for loadout
	 * @return loadout name
	 */
	public String getLoadoutName() {
		return loadoutName;
	}
	public void setLoadoutName(String loadoutName) {
		this.loadoutName = loadoutName;
	}
	
	/**
	 * How many perks the player used
	 * @return number of perks
	 */
	public int getNumberOfPerks() {
		return numberOfPerks;
	}
	public void setNumberOfPerks(int numberOfPerks) {
		this.numberOfPerks = numberOfPerks;
	}
	

}
