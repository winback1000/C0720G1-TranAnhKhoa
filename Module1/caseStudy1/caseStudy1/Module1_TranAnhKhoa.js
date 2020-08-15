function getinfo() {
    var namevar = document.getElementById("name").value;
    console.log(namevar);
    var identityNumbervar = document.getElementById("identityNumber").value;
    var dateOfBirthvar = document.getElementById("dateOfBirth").value;
    var emailvar = document.getElementById("email").value;
    var addressvar = document.getElementById("address").value;
    var vipTypevar = document.getElementById("vipType").value;
    var discountvar = parseFloat(document.getElementById("discount").value);
    var peoplevar = document.getElementById("people").value;
    var rentDayvar = parseInt(document.getElementById("rentDay").value);
    var serviceTypevar = parseFloat(document.getElementById("serviceType").value);
    var roomTypevar = document.getElementById("roomType").value;
    var cost = serviceTypevar * rentDayvar * (1-(discountvar/100));
    let elem = document.getElementById('div1');
    elem.style.display= 'none';
    let elem2 = document.getElementById('div2');
    elem2.style.display='block';
    document.getElementById('greeting').innerHTML = ('Greeting '+namevar+' !<br><br>Welcome to the XXX Resort!')
    document.getElementById('profileName').innerHTML = (namevar);
    document.getElementById('profileIdentityNumber').innerHTML = (identityNumbervar);
    document.getElementById('profileDateOfBirth').innerHTML = (dateOfBirthvar);
    document.getElementById('profileEmail').innerHTML = (emailvar);
    document.getElementById('profileAddress').innerHTML = (addressvar);
    document.getElementById('profileVipType').innerHTML = (vipTypevar);
    document.getElementById('profileDiscount').innerHTML = (discountvar);
    document.getElementById('profileAmountPeople').innerHTML = (peoplevar);
    document.getElementById('profileRentDay').innerHTML = (rentDayvar);
    document.getElementById('profileServiceType').innerHTML = (serviceTypevar);
    document.getElementById('profileRoomType').innerHTML = (roomTypevar);

    document.getElementById('ProfileEstimatePrice').innerHTML = (cost+' $');
}

function edit() {
    let elem2 = document.getElementById('div2');
    elem2.style.display='none';
    let elem = document.getElementById('div1');
    elem.style.display= 'block';
}
