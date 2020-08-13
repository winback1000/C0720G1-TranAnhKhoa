function getinfo() {
    let namevar = document.getElementById("name").value;
    console.log(namevar);
    let identityNumbervar = document.getElementById("identityNumber").value;
    let dateOfBirthvar = document.getElementById("dateOfBirth").value;
    let emailvar = document.getElementById("email").value;
    let addressvar = document.getElementById("address").value;
    let vipTypevar = document.getElementById("vipType").value;
    let discountvar = parseFloat(document.getElementById("discount").value);
    let peoplevar = document.getElementById("people").value;
    let rentDayvar = parseInt(document.getElementById("rentDay").value);
    let serviceTypevar = parseFloat(document.getElementById("serviceType").value);
    let roomTypevar = document.getElementById("roomType").value;
    let cost = serviceTypevar * rentDayvar * (1-(discountvar/100));
    alert(cost+"$");
    document.getElementById("estimatedcost").value=cost;
    }