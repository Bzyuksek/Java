package Day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "111f",
                streetName = "John Branch Dr",
                city = "McLean",
                state = "VA",
                zipcode = "22031A";
/*
        String name = "James King";
        String buildingNumber = "111f";
        String streetName = "John Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipcode = "22031A";
*/

        //System.out.println(name + "\n" +buildingNumber + " " + streetName +"\n" + city + ", " + state + " " + zipcode);

        String address = name + "\n" +buildingNumber + " " + streetName +"\n" + city + ", " + state + " " + zipcode;

        System.out.println(address);
    }

}
/*
Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
 */