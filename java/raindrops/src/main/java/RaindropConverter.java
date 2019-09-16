class RaindropConverter {

    String convert(int number) {
        String result = "";
	result+= number % 3 == 0 ? "Pling" : "";
	result+= number % 5 == 0 ? "Plang" : "";
	result+= number % 7 == 0 ? "Plong" : "";
	return result.length() > 0 ? result : String.valueOf(number);
    }

}
