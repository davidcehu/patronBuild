package patron_builder;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usu = new UsuarioBuilder()
				.email("hola@esviernes.com")
				.nombre("Juan","González")
				.direccion("Calle Perena, 25")
				.build();
	
		System.out.println(usu);
	}

}
