const stringReplacement = (string) => {
	string = string.split("")
	for(let i in string){
		string[i] == 'G' ? string[i] = 'C' : 
		string[i] == 'C' ? string[i] = 'G' : 
		string[i] == 'T' ? string[i] = 'A' :
		string[i] == 'A' ? string[i] = 'U' : false
	}
	return string.join("")
}
export const toRna = (dnaString) => {
	return stringReplacement(dnaString);
};
