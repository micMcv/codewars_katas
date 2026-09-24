public class StringPacket {
    public static String communicationModule(String packet) {
        String h = packet.substring(0,4), i = packet.substring(4,8), f = packet.substring(16,20);

        Integer d1 = Integer.parseInt(packet.substring(8,12));
        Integer d2 = Integer.parseInt(packet.substring(12,16));

        Integer r = switch (i){
            case 0F12 -> d1 + d2;
            case B7A2 -> d1 - d2;
            case C3D9 -> d1 * d2;
            default -> 0;
        };

        return String.format(%sFFFF%04d0000%s, h, r < 0 ? 0 : r > 9999 ? 9999 : r, f );
    }
}
