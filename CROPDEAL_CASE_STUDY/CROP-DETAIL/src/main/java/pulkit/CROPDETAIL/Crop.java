package pulkit.CROPDETAIL;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Crop")
public class Crop {
	 private String farmerid;
	    private String name;
	    private int cost;
	    private int quantity;
	    private String type;
	    private Boolean Active ;
		public Crop(String farmerid, String name, int cost, int quantity, String type, Boolean active) {
			super();
			this.farmerid = farmerid;
			this.name = name;
			this.cost = cost;
			this.quantity = quantity;
			this.type = type;
			Active = active;
		}
		public String getFarmerid() {
			return farmerid;
		}
		public void setFarmerid(String farmerid) {
			this.farmerid = farmerid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Boolean getActive() {
			return Active;
		}
		public void setActive(Boolean active) {
			Active = active;
		}

}
