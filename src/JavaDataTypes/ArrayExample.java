package JavaDataTypes;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] companiesOfCars = {"Audi", "Mercedes", "BMW", "Skoda"};
		String totalCompaniesOfCars = "";
		for(String companyOfCar: companiesOfCars) {
			totalCompaniesOfCars += companyOfCar + ", ";
		}
		System.out.println("Total companies of cars in my collection are: " + totalCompaniesOfCars);

	}

}
