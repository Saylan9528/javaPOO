package view;

public class calcularHex {
    private int strNum1;
    private int strNum2;
    private int result;
    public String resultTXT;
    
    calcularHex(){
        
    }
    
    calcularHex(String strNum1, String strNum2){
        this.strNum1 = Integer.parseInt(strNum1, 16);
        this.strNum2 = Integer.parseInt(strNum2, 16);
        calculoOffSet();
        converter();
    }
    
    private void calculoOffSet(){
        int diferenca = strNum2 - strNum1;
        int bytesPorLinha = 16;
        this.result = (diferenca / bytesPorLinha) + 1;
    }
    
    public void converter(){
        this.resultTXT = String.valueOf(this.result);
    }
}
