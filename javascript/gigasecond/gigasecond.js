const secondsToMilliseconds = (seconds) => seconds * 1000; //Average: 1.89s
const oneGigasecond = Math.pow(10,9)
export const gigasecond = (data) => {
//	const secondsToMilliseconds = (seconds) => seconds * 1000; // Average: 2.09s
//	const oneGigasecond = Math.pow(10,9);
	return new Date(data.getTime() + secondsToMilliseconds(oneGigasecond)); //Date.getTime() return milliseconds, so we need to multiply the seconds by 1000
}
