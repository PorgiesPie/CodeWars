// Take the following IPv4 address: 128.32.10.1
// This address has 4 octets where each octet is a single byte (or 8 bits).
//    1st octet 128 has the binary representation: 10000000
//    2nd octet 32 has the binary representation: 00100000
//    3rd octet 10 has the binary representation: 00001010
//    4th octet 1 has the binary representation: 00000001
// So 128.32.10.1 == 10000000.00100000.00001010.00000001
// Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
// Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

public class Kata {
    public static String longToIP(long ip) {

        StringBuilder result = new StringBuilder();
        String binary = Long.toBinaryString(ip);
        System.out.println(binary);
        String[] arr = new String[4];

        if (binary.length() != 32){
            StringBuilder sb = new StringBuilder();
            for (int i = binary.length(); i < 32; i++) {
                sb.append("0");
            }
            sb.append(binary);
            binary = sb.toString();
        }
        arr[0] = binary.substring(0, 8);
        arr[1] = binary.substring(8, 16);
        arr[2] = binary.substring(16, 24);
        arr[3] = binary.substring(24);

        result.append(Integer.parseInt(arr[0], 2)).append(".")
                .append(Integer.parseInt(arr[1], 2)).append(".")
                .append(Integer.parseInt(arr[2], 2)).append(".")
                .append(Integer.parseInt(arr[3], 2));

        return result.toString();

    }
}
