package gow2.com.java;

/**
 *
 * @author phmm
 */
public class HexToLittleEndian {
    private String valorHex;
    public String result;
    
    public HexToLittleEndian() {
    }
    
    public HexToLittleEndian(String valorHex) {
        this.valorHex = formataHex(valorHex);
        this.result = converteHex(hexToByte(this.valorHex));
    }
    
    private String getValorHex() {
        return valorHex;
    }
    
    public String getResult() {
        return result;
    }
    
    private String formataHex(String valorHex) {
        if (valorHex.startsWith("0x")) {
            valorHex = valorHex.substring(2);
        }
        
        if (valorHex.length() % 2 != 0) {
            valorHex = "0" + valorHex;
        }
        return valorHex;
    }
    
    private byte[] hexToByte(String valorHex) {
        int len = valorHex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(valorHex.charAt(i), 16) << 4)
                                  + Character.digit(valorHex.charAt(i+1), 16));
        }
        return data;
    }
    
    private String converteHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = bytes.length - 1; i >= 0; i--) {
            sb.append(String.format("%02X", bytes[i]));
        }
        return sb.toString();
    }
}