let namevar;
let identityNumbervar;
let dateOfBirthvar;
let customerAge;
let emailvar;
let addressvar;
let vipTypevar;
let discountvar;
let peoplevar;
let rentDayvar;
let serviceTypevar;
let roomTypevar;
function submit() {
    getInfo();
    let allCorrect = true;
    if (!checkIdentityNumber(identityNumbervar)) {
        alert('please correct the Identity Number');
        allCorrect = false;
    } else if (!checkEmail(emailvar)) {
        alert('please correct the email address');
        allCorrect = false;
    } else if (!checkDiscount(discountvar)) {
        alert('please correct the discount value');
        allCorrect = false;
    } else if (!checkPeopleQuantity(peoplevar)) {
        alert('please correct the quantity of people');
        allCorrect = false;
    } else if (!checkRentDay(rentDayvar)) {
        alert('please correct the rent day');
        allCorrect = false;
    }
    if (allCorrect === true) {
        displaySwitch();
        display2();
    }
}
function getInfo() {
    namevar = document.getElementById("name").value;
    identityNumbervar = document.getElementById("identityNumber").value;
    dateOfBirthvar = document.getElementById("dateOfBirth").value;
    customerAge = (new Date().getFullYear() - new Date(dateOfBirthvar).getFullYear());
    console.log(customerAge);
    emailvar = document.getElementById("email").value;
    addressvar = document.getElementById("address").value;
    vipTypevar = document.getElementById("vipType").value;
    discountvar = parseFloat(document.getElementById("discount").value);
    peoplevar = document.getElementById("people").value;
    rentDayvar = parseInt(document.getElementById("rentDay").value);
    serviceTypevar = parseFloat(document.getElementById("serviceType").value);
    roomTypevar = document.getElementById("roomType").value;
}
function addressAndAgeCaculate(address, age) {
    let addressDiscount;
    if (address === 'Da Nang') {
        addressDiscount = 20;
        if (age>=30) {
            addressDiscount += 2;
        } else if((age>=20)&&(age<30)) {
            addressDiscount += 1;
        }
    } else if (address === 'Hue') {
        addressDiscount = 10;
    } else if (address === 'Quang Nam') {
        addressDiscount = 5;
    } else {
        addressDiscount = 0;
    }
    return addressDiscount;
}
function vipCaculate (vipType) {
    let vipDiscount;
    if (vipType === 'Member') {
        vipDiscount = 0;
    } else if (vipType === 'Silver') {
        vipDiscount = 2;
    } else if (vipType === 'Gold') {
        vipDiscount = 5;
    } else if (vipType === 'Platinum') {
        vipDiscount = 10;
    } else {
        vipDiscount = 15;
    }
    return vipDiscount;
}

        // console.log('vip discount = '+vipDiscount);
function rentDayCaculate(day) {
    let rentDayDiscount;
    if (day <2) {
        rentDayDiscount = 0;
    } else if (day <= 4) {
        rentDayDiscount = 10;
    } else if (day <= 7) {
        rentDayDiscount = 20;
    } else {
        rentDayDiscount = 30;
    }
    return rentDayDiscount;
}
function displaySwitch() {
    let elem = document.getElementById('div1');
    elem.style.display= 'none';
    let elem2 = document.getElementById('div2');
    elem2.style.display='block';
}
function display2() {
    document.getElementById('greeting').innerHTML = ('Greeting '+correctName(namevar)+' !<br><br>Welcome to the XXX Resort!');
    document.getElementById('profileName').innerHTML = (correctName(namevar));
    document.getElementById('profileIdentityNumber').innerHTML = (identityNumbervar);
    document.getElementById('profileAge').innerHTML = (customerAge);
    document.getElementById('profileEmail').innerHTML = (emailvar);
    document.getElementById('profileAddress').innerHTML = (addressvar);
    document.getElementById('profileVipType').innerHTML = (vipTypevar);
    document.getElementById('profileDiscount').innerHTML = (discountvar);
    document.getElementById('profileAmountPeople').innerHTML = (peoplevar);
    document.getElementById('profileRentDay').innerHTML = (rentDayvar);
    document.getElementById('profileServiceType').innerHTML = (serviceTypevar);
    document.getElementById('profileRoomType').innerHTML = (roomTypevar);
    let cost = (serviceTypevar * rentDayvar * (1-(discountvar/100))) - addressAndAgeCaculate(addressvar, customerAge) - vipCaculate(vipTypevar) - rentDayCaculate(rentDayvar);
    console.log('price1 estimate ='+ (serviceTypevar * rentDayvar * (1-(discountvar/100))));
    console.log('after all discount ='+cost);
    document.getElementById('ProfileEstimatePrice').innerHTML = (cost+' $');
}
function edit() {
    let elem2 = document.getElementById('div2');
    elem2.style.display='none';
    let elem = document.getElementById('div1');
    elem.style.display= 'block';
}
function correctName(string) {
    let name = [];
    for (let i=0; i<string.length; i++) {
        if (((string[i] ===" ") && (string[i-1] === " ")) || (string[i]>0)) {
        } else if ((string[i-1] === " ") || (i===0)) {
            name.push(string[i].toUpperCase());
        }
        else {
            name.push(string[i].toLowerCase());
        }
    }
    while (name[0] === " ") {
        name.shift();
    }
    while (name[name.length - 1] === " ") {
        name.pop();
    }
    return (name.join(""));
}
function checkIdentityNumber(string) {
    for (let i = 0; i<string.length; i++) {
        if ((isNaN(string[i])) ||
            (string[i]<0) ||
            (string[i]===" ") ||
            (string.length !== 8)) {
            return  false;
        }
    }
    return true;
}
function checkEmail(string) {
    return !((string.indexOf('@') !== string.lastIndexOf('@')) ||
        (string.lastIndexOf('.') < string.indexOf('@')) ||
        (string.indexOf(' ') !== -1));
}
function checkDiscount(string) {
    return (!(isNaN(string) ||
        !Number.isInteger(parseFloat(string)) ||
        (parseFloat(string) < 0)));
}
function checkPeopleQuantity(string) {
    return (!(isNaN(string) ||
        !Number.isInteger(parseFloat(string)) ||
        (parseFloat(string) < 0)));
}
function checkRentDay(string) {
    return (!(isNaN(string) ||
        !Number.isInteger(parseFloat(string)) ||
        (parseFloat(string) < 0)));
}