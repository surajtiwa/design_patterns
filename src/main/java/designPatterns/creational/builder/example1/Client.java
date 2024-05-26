package designPatterns.creational.builder.example1;

import java.time.LocalDate;
//Builder Pattern is used to create Complex Object in a simplified way
//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
		User user=createUser();
		UserDTOBuilder builder=new UserWebDTOBuilder();
		UserDTO dto=directBuild(builder,user);
		System.out.println(dto);

    }

    //Director Using the builder to create the dto
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withAddress(user.getAddress()).
                withBirthday(user.getBirthday()).build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
