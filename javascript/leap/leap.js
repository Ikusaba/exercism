export const isLeap = (year) => {
//	if(year % 4 != 0){return false;}
//	else if(year % 100 != 0){return true;}
//	else if(year % 400 != 0){return false;}
//	else{return true;}
	return year % 4 != 0 ? false : year % 100 != 0 ? true : year % 400 != 0 ? false : true

};
