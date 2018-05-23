
public class vectorMalvado {

	static int dim = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dim2 = 99;
		System.out.println(dim2);

		int[] vec = new int[dim];

		CargoVector(vec);

		for (int i = 0; i < dim; i++) {
			System.out.print(vec[i] + " ");

		} // Aca termina el for rancio

	}// Aca termina el metodo main

	public static void CargoVector(int[] vec) {
		for (int i = 0; i < dim; i++) {
			vec[i] = (int) (Math.random() * 100);

		} // Aca termina el for pelotudo

	} // Aca termina el metodo CargoVector

} // Aca termina la clase piola