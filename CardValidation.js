function AtmCard(){

	let cardNumber = new array();
	let cardlength = cardNumber.legth;
	let visaCard = {};
	let masterCard = {};
	let discoverCard = {};
	let americaExpressCard = {};
	let valid = {};
	let invalid = {};
	let issuer = {};

for(let cardCount = 0; cardCount < cardNumber.legth; cardCount++){
	if(cardNumber[cardCount] == NaN){
	console.log("This not applicable")
	}
}
	if(cardlength == 16 && cardnumber(0) == 5){
		masterCard.valid = true;
	return valid; 
	}
	else
	if(cardlength != 16 && cardnumber(0) != 5){
masterCard.valid = true;
masterCard.issuer = masterCard;
return invalid; 
}

if(cardlength == 16 && cardnumber(0) == 4){
visaCard.valid = true;
visaCard.issuer = visaCard;
return valid; 
}
else
if(cardlength != 16 && cardnumber(0) != 4){
visaCard.valid = true;
visaCard.issuer = visaCard;
return invalid; 
}

if(cardlength == 16 && cardnumber(0) == 6){
discoverCard.valid = true;
discoverCard.issuer = discoverCard;
return valid; 
}

else
if(cardlength != 16 && cardnumber(0) != 6){
discoverCard.valid = true;
discoverCard.issuer = discoverCard;
return invalid; 
}

if(cardlength == 16 && cardnumber(0) == 3){
americaExpressCard.valid = true;
americaExpressCard.issuer = americaExpressCard;
return valid; 
}

else
if(cardlength != 16 && cardnumber(0) != 6){
americaExpressCard.valid = true;
americaExpressCard.issuer = americaExpressCard;
return invalid; 
}


}
