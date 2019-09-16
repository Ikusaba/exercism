class Hamming {
	private int result = 0;
    Hamming(String leftStrand, String rightStrand) {
	if(leftStrand.length() < 1 && rightStrand.length() > 0) throw new IllegalArgumentException ("left strand must not be empty.");
	if(rightStrand.length() < 1 && leftStrand.length() > 0) throw new IllegalArgumentException ("right strand must not be empty.");
	if(leftStrand.length() != rightStrand.length()){
		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
	}
	char[] arrLeftStrand = leftStrand.toCharArray();
	char[] arrRightStrand = rightStrand.toCharArray();
	for(int i = 0; i < leftStrand.length(); i++){
		if(arrLeftStrand[i] != arrRightStrand[i]) result++;
	}
    }

    int getHammingDistance() {
	return this.result;	
    }

}
