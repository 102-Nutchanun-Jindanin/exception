// ก. สร้าง Custom Exception 
class MyTestException extends RuntimeException { // สืบทอดจาก RuntimeException 
    private int errorCode; // มีตัวแปร errorCode 

    // Constructor รับ Message และ error code 
    public MyTestException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() { // มี method getErrorCode() 
        return errorCode;
    }
}

//68122250102 ณัฐชนันท์ จินดานิล