function getinfo() {
    var namevar = document.getElementById("name").value;
    console.log(namevar);
    var identityNumbervar = document.getElementById("identityNumber").value;
    var dateOfBirthvar = document.getElementById("dateOfBirth").value;
    console.log(dateOfBirthvar);
    let currentYear = new Date().getFullYear();
    console.log(currentYear);
    var customerAge = (new Date().getFullYear()-new Date(dateOfBirthvar).getFullYear());
    console.log('customer age = '+customerAge);
    var ageDiscount = 0;
    var emailvar = document.getElementById("email").value;
    var addressvar = document.getElementById("address").value;
    var addressDiscount;
        if (addressvar == 'Da Nang') {
            addressDiscount = 20;
            if (customerAge>=30) {
                ageDiscount += 2;
            } else if((customerAge>=20)&&(customerAge<30)) {
                ageDiscount += 1;
            }
        } else
        if (addressvar == 'Hue') {
        addressDiscount = 10;
        } else
        if (addressvar == 'Quang Nam') {
        addressDiscount = 5;
        } else {
        addressDiscount = 0;
        }
        console.log('address discount ='+addressDiscount);
        console.log('address and age discount = '+ageDiscount);
    var vipTypevar = document.getElementById("vipType").value;
    var vipDiscount;
        if (vipTypevar == 'Member') {
            vipDiscount = 0
        } else
        if (vipTypevar == 'Silver') {
        vipDiscount = 2
        } else
        if (vipTypevar == 'Gold') {
        vipDiscount = 5
        } else
        if (vipTypevar == 'Platinum') {
        vipDiscount = 10
        } else {
        vipDiscount = 15
        }
        console.log('vip discount = '+vipDiscount)
    var discountvar = parseFloat(document.getElementById("discount").value);
    var peoplevar = document.getElementById("people").value;
    var rentDayvar = parseInt(document.getElementById("rentDay").value);
    var rentDayDiscount;
        if (rentDayvar <2) {
            rentDayDiscount = 0;
        } else if (rentDayvar <= 4) {
            rentDayDiscount = 10;
        } else if (rentDayvar <= 7) {
            rentDayDiscount = 20;
        } else {
            rentDayDiscount = 30;
        }
        console.log("rent day discount = "+rentDayDiscount)

    var serviceTypevar = parseFloat(document.getElementById("serviceType").value);
    var roomTypevar = document.getElementById("roomType").value;

    let elem = document.getElementById('div1');
    elem.style.display= 'none';
    let elem2 = document.getElementById('div2');
    elem2.style.display='block';
    document.getElementById('greeting').innerHTML = ('Greeting '+namevar+' !<br><br>Welcome to the XXX Resort!')
    document.getElementById('profileName').innerHTML = (namevar);
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
    var cost = (serviceTypevar * rentDayvar * (1-(discountvar/100))) - addressDiscount - ageDiscount - vipDiscount - rentDayDiscount;
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
