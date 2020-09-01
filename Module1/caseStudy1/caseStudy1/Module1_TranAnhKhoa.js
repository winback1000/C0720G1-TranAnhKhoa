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
let nameEmployee;
let identityNumberEmployee;
let dateOfBirthEmployee;
let customerAgeEmployee;
let emailEmployee;
let addressEmployee;
let vipTypeEmployee;
let discountEmployee;
let peopleEmployee;
let rentDayEmployee;
let serviceTypeEmployee;
let roomTypeEmployee;
let position;
let names = [];
let employees = [];
let temp;
let tempEmployee;
let menuAddCustomerInfo = document.getElementById('editCustomerInfo');
let menuDisplayCustomerInfo = document.getElementById('displayCustomerInfo');
let menuAddNewCustomer = document.getElementById('addNewCustomers');
let menuAddNewEmployee = document.getElementById('addNewEmployee');
let menuAddEmployeeInfo = document.getElementById('editEmployeeInfo');
let menuDisplayEmployeeInfo = document.getElementById('displayEmployeeInfo');
function submit(i) {
    let allCorrect = true;
    if (!checkIdentityNumber(identityNumbervar)) {
        alert('please correct the Identity Number');
        allCorrect = false;
        showEditCustomerInformation();
    } else if (!checkEmail(emailvar)) {
        alert('please correct the email address');
        allCorrect = false;
        showEditCustomerInformation();
    } else if (!checkDiscount(discountvar)) {
        alert('please correct the discount value');
        allCorrect = false;
        showEditCustomerInformation();
    } else if (!checkPeopleQuantity(peoplevar)) {
        alert('please correct the quantity of people');
        allCorrect = false;
        showEditCustomerInformation();
    } else if (!checkRentDay(rentDayvar)) {
        alert('please correct the rent day');
        allCorrect = false;
        showEditCustomerInformation();
    }
    console.log("done Checking");
    if (allCorrect === true) {
        names[i].setName(namevar);
        names[i].setIdentityNumber(parseInt(identityNumbervar));
        names[i].setDayOfBirth(dateOfBirthvar);
        names[i].setEmail(emailvar);
        names[i].setAddress(addressvar);
        names[i].setViptype(vipTypevar);
        names[i].setDiscount(discountvar);
        names[i].setPeople(peoplevar);
        names[i].setRentDay(rentDayvar);
        names[i].setServiceType(serviceTypevar);
        names[i].setRoomType(roomTypevar);
        // displaySwitch();
        console.log(names);
        console.log("done submit");
        allInfoDisplay(i);
    }
}
function getInfo() {
    namevar = correctName(document.getElementById("name").value);
    identityNumbervar = document.getElementById("identityNumber").value;
    dateOfBirthvar = document.getElementById("dateOfBirth").value;
    customerAge = (new Date().getFullYear() - new Date(dateOfBirthvar).getFullYear());
    emailvar = document.getElementById("email").value;
    addressvar = correctName(document.getElementById("address").value);
    vipTypevar = correctName(document.getElementById("vipType").value);
    discountvar = document.getElementById("discount").value;
    peoplevar = document.getElementById("people").value;
    rentDayvar = document.getElementById("rentDay").value;
    serviceTypevar = correctName(document.getElementById("serviceType").value);
    roomTypevar = correctName(document.getElementById("roomType").value);
    console.log("done getinfo");
}
function allInfoDisplay(i) {
    let form2= `<h2 id="greeting" value=""></h2>
    <table class="table">
        <tr>
            <th style="text-align: right">Full name: </th>
            <td style="text-align: left" id="profileName"><input id="name2" type="text" readonly value = ${names[i].name}></td>
        </tr>
        <tr>
            <th style="text-align: right">Identity number: </th>
            <td style="text-align: left" ><input type="text" readonly value = ${names[i].identityNumber}></td>
        </tr>
        <tr>
            <th style="text-align: right">Age: </th>
            <td style="text-align: left" id="profileAge"><input type="text" readonly value = ${names[i].getAge()}></td>
        </tr>
        <tr>
            <th style="text-align: right">Email: </th>
            <td style="text-align: left" id="profileEmail"><input type="text" readonly value = ${names[i].email}></td>
        </tr>
        <tr>
            <th style="text-align: right">Address: </th>
            <td style="text-align: left" id="profileAddress"><input type="text" readonly value = ${names[i].address}></td>
        </tr>
        <tr>
            <th style="text-align: right">Vip type: </th>
            <td style="text-align: left" id="profileVipType"><input type="text" readonly value = ${names[i].vipType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Discount: </th>
            <td style="text-align: left" id="profileDiscount"><input type="text" readonly value = ${names[i].discount}> %</td>
        </tr>
        <tr>
            <th style="text-align: right">How many people<br>will stay in our resort?: </th>
            <td style="text-align: left" id="profileAmountPeople"><input type="text" readonly value = ${names[i].people}></td>
        </tr>
        <tr>
            <th style="text-align: right">Rent day: </th>
            <td style="text-align: left" id="profileRentDay"><input type="text" readonly value = ${names[i].rentDay}></td>
        </tr>
        <tr>
            <th style="text-align: right">Service type: </th>
            <td style="text-align: left" id="profileServiceType"><input type="text" readonly value = ${names[i].serviceType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Room Type: </th>
            <td style="text-align: left" id="profileRoomType"><input type="text" readonly value = ${names[i].roomType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Estimate price: </th>
            <td style="text-align: left" id="ProfileEstimatePrice"><input type="text" readonly value = ${names[i].totalCost()}> $</td>
        </tr>
    </table>`;
    temp = i;
    form2 += `<button onclick="showEditCustomerInformation(); editCustomer(temp)" ; style="position: absolute;left: 300px; top: 630px">Edit</button>`;
    document.getElementById('containOfDisplayCustomerInfo').innerHTML = form2;
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
function displayAddNewCustomer() {
    let table = '<table class="table">' +
        '<tr>' +
        '<th>Customers Name</th>' +
        '<td></td>' +
        '<td></td>' +
        '<td><p id = "total" style="color: red"></p></td>' +
        '</tr>' +
        `<tr>`   ;
    for (let i = 0; i<names.length; i++) {
        table += `<tr>
                      <td style="font-weight: bold" ${i}>${names[i].name}</td>
                      <td><button class="button" type="button" onclick="editCustomer(${i})">Edit</button></td>
                      <td><button class="button" type="button" onclick="deleteProduct(${i})">Delete</button></td>
                      <td><button class="button" type="button" onclick="allInfoDisplay(${i}); showdisplayCustomerInfo()">Show all Information</button></td>
                      </tr>`
    }
    table +=  `</table>`;
    document.getElementById('customersList').innerHTML = table;
    document.getElementById('total').innerHTML = (names.length+" Customers");
}
function editCustomer(i) {
    showEditCustomerInformation();
    temp = i;
    document.getElementById('containOfEditCustomerInfo').innerHTML = `<h2>Please fill some information about the customer</h2>
    <table>
        <tr>
            <th style="text-align: right"><label for="name">Full name</label></th>
            <td style="text-align: left"><input id="name" type="text" value = ${names[i].getName()}></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="identityNumber">Identity number</label></th>
            <td style="text-align: left"><input id="identityNumber" type="text" value= ${names[i].getIdentityNumber()}></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="dateOfBirth">Date of birth</label></th>
            <td style="text-align: left"><input id="dateOfBirth" type="date" value="${names[i].getDateOfBirth()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="email">Email</label></th>
            <td style="text-align: left"><input id="email" type="text" value="${names[i].getEmail()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="address">Address</label></th>
            <td style="text-align: left"><input id="address" type="text" value="${names[i].getAddress()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"> <label for="vipType">Vip type</label></th>
            <td style="text-align: left"><input id="vipType" type="text" placeholder="Diamond, Platinium, Gold, Silver, Member" value="${names[i].getVipType()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="discount">Discount</label></th>
            <td style="text-align: left"><input id="discount" type="number" value="${names[i].getDiscount()}">%</td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="people">How many people<br>will stay in our resort?</label></th>
            <td style="text-align: left"><input id="people" type="number" value="${names[i].getPeope()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="rentDay">Rent day</label></th>
            <td style="text-align: left"><input id="rentDay" type="number" value="${names[i].getRentDay()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="serviceType">Service type</label></th>
            <td style="text-align: left"><input id="serviceType" type="text" placeholder="Villa, House, Room" value="${names[i].getServiceType()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"> <label for="roomType">Room Type</label></th>
            <td style="text-align: left"><input id="roomType" type="text" placeholder="Vip, Business, Normal" value="${names[i].getRoomType()}"></td>
        </tr>
    </table>
    <button onclick="getInfo(); submit(temp); showdisplayCustomerInfo()" ; style="position: absolute;left: 300px; top: 400px">Submit</button>`;
}
function addOneCustomer() {
    let name = correctName(document.getElementById('newCustomer').value);
    if (checkDuplicateAndNullName(name)) {
        name = new Customer(name);
        names.push(name);
        names.sort((n1,n2) => (n1.name > n2.name) ?1 : (n1.name < n2.name) ? -1 : 0);
        console.log(names);
        displayAddNewCustomer();
    } else {
        alert("This name is already added or name can't be empty or includes number")
    }
}
function deleteProduct(i) {
    names.splice(i,1);
    displayAddNewCustomer();
}
function checkDuplicateAndNullName(name) {
    let checkName = names.findIndex(Customer => Customer.name === name);
    return !((checkName !== -1) || (name === ""));
}
function addSeveralCustomers() {
    let a = parseInt(prompt("Please input how many customers you want to add"));
    for (let i = 0; i < a;) {
        let name = correctName(prompt("Please input the numer " + (i + 1) + " customer name"));
        if (checkDuplicateAndNullName(name)) {
            name = new Customer(name);
            names.push(name);
            names.sort((n1,n2) => (n1.name > n2.name) ? 1 : (n1.name < n2.name) ? -1 : 0);
            console.log(names);
            i++;
        } else {
            alert("This name is already added or name can't be empty or includes number")
        }
    }
    displayAddNewCustomer();
}
function showAddNewCustomer() {
    menuAddCustomerInfo.style.display= 'none';
    menuDisplayCustomerInfo.style.display='none';
    menuAddNewCustomer.style.display='block';
    menuAddNewEmployee.style.display='none';
    menuAddEmployeeInfo.style.display='none';
    menuDisplayEmployeeInfo.style.display='none';
}
function showEditCustomerInformation() {
    menuAddCustomerInfo.style.display= 'block';
    menuDisplayCustomerInfo.style.display='none';
    menuAddNewCustomer.style.display='none';
    menuAddNewEmployee.style.display='none';
    menuAddEmployeeInfo.style.display='none';
    menuDisplayEmployeeInfo.style.display='none';
    // registerCustomer();
    // displayEditCustomerInfo();
}
function showdisplayCustomerInfo() {
    menuAddCustomerInfo.style.display= 'none';
    menuDisplayCustomerInfo.style.display='block';
    menuAddNewCustomer.style.display='none';
    menuAddNewEmployee.style.display='none';
    menuAddEmployeeInfo.style.display='none';
    menuDisplayEmployeeInfo.style.display='none';
}
// function nameLocation(name) {
//     return names.findIndex(Customer => Customer.name === name);
// }
class Customer {
    constructor(name) {
        this.name = name;
        this.identityNumber = "";
        this.dateOfBirth ="";
        this.email = "";
        this.address = "";
        this.vipType ="";
        this.discount = "";
        this.people = "";
        this.rentDay = "";
        this.serviceType = "";
        this.roomType = "";
    }
    getName() {
        return this.name;
    }
    getIdentityNumber(){
        return this.identityNumber;
    }
    getDateOfBirth(){
        return this.dateOfBirth;
    }
    getEmail() {
        return this.email;
    }
    getAddress() {
        return this.address;
    }
    getVipType() {
        return this.vipType;
    }
    getDiscount(){
        return this.discount;
    }
    getPeope(){
        return this.people;
    }
    getRentDay() {
        return this.rentDay;
    }
    getServiceType() {
        return this.serviceType;
    }
    getRoomType(){
        return this.roomType;
    }
    setName(name){
        this.name = name;
    }
    setIdentityNumber(number){
        this.identityNumber = number;
    }
    setDayOfBirth(date){
        this.dateOfBirth = date;
    }
    setEmail(email) {
        this.email = email;
    }
    setAddress(address) {
        this.address = address;
    }
    setViptype(vip) {
        this.vipType = vip;
    }
    setDiscount(number) {
        this.discount = number;
    }
    setPeople(number) {
        this.people = number;
    }
    setRentDay(number) {
        this.rentDay = number;
    }
    setServiceType(type) {
        this.serviceType = type;
    }
    setRoomType (type) {
        this.roomType = type;
    }
    getAge() {
        return (new Date().getFullYear() - new Date(this.dateOfBirth).getFullYear());
    }
    addressAndAgeCaculate() {
        let addressDiscount;
        if (this.address.indexOf('Da Nang') !== -1) {
            addressDiscount = 20;
            if (this.getAge() >=30) {
                addressDiscount += 2;
            } else if((this.getAge()>=20)&&(this.getAge()<30)) {
                addressDiscount += 1;
            }
        } else if (this.address.indexOf('Hue') !== -1) {
            addressDiscount = 10;
        } else if (this.address.indexOf('Quang Nam') !== -1) {
            addressDiscount = 5;
        } else {
            addressDiscount = 0;
        }
        return addressDiscount;
    }
    vipCaculate () {
        let vipDiscount;
        if (this.vipType === 'Member') {
            vipDiscount = 0;
        } else if (this.vipType === 'Silver') {
            vipDiscount = 2;
        } else if (this.vipType === 'Gold') {
            vipDiscount = 5;
        } else if (this.vipType === 'Platinum') {
            vipDiscount = 10;
        } else {
            vipDiscount = 15;
        }
        return vipDiscount;
    }
    rentDayCaculate() {
        let rentDayDiscount;
        if (this.rentDay <2) {
            rentDayDiscount = 0;
        } else if (this.rentDay <= 4) {
            rentDayDiscount = 10;
        } else if (this.rentDay <= 7) {
            rentDayDiscount = 20;
        } else {
            rentDayDiscount = 30;
        }
        return rentDayDiscount;
    }
    serviceTypeCaculate() {
        if (this.serviceType === "Villa") {
            return 500;
        } else if (this.serviceType === "House") {
            return 300;
        } else if (this.serviceType === "Room") {
            return 100;
        } else {
            alert("Please correct the service type")
        }

    }
    totalCost() {
        return (this.serviceTypeCaculate() * this.rentDay * (1-(this.discount/100))) - this.addressAndAgeCaculate() - this.vipCaculate() - this.rentDayCaculate();
    }
}
class Employee extends Customer {
    constructor(name) {
        super(name);
        this.position = "";
    }
    getPosition() {
    return this.position;
    }
    setPosition(string) {
        this.position = string;
    }
    discountposition() {
        if (this.position === "Manager") {
            return 500;
        } else if (this.position === "Sale") {
            return 300;
        } else if (this.position === "Marketing") {
            return 200;
        } else {
            return alert("Please correct the position")
        }
    }
}
function showAddEmployee() {
    menuAddCustomerInfo.style.display= 'none';
    menuDisplayCustomerInfo.style.display='none';
    menuAddNewCustomer.style.display='none';
    menuAddNewEmployee.style.display='block';
    menuAddEmployeeInfo.style.display='none';
    menuDisplayEmployeeInfo.style.display='none';
}
function showEditEmployeeInformation() {
    menuAddCustomerInfo.style.display= 'none';
    menuDisplayCustomerInfo.style.display='none';
    menuAddNewCustomer.style.display='none';
    menuAddNewEmployee.style.display='none';
    menuAddEmployeeInfo.style.display='block';
    menuDisplayEmployeeInfo.style.display='none';
}
function showdisplayEmployeeInfo() {
    menuAddCustomerInfo.style.display= 'none';
    menuDisplayCustomerInfo.style.display='none';
    menuAddNewCustomer.style.display='none';
    menuAddNewEmployee.style.display='none';
    menuAddEmployeeInfo.style.display='none';
    menuDisplayEmployeeInfo.style.display='block';
}
function displayAddNewEmployee() {
    let table = '<table class="table">' +
        '<tr>' +
        '<th>Employees Name</th>' +
        '<td></td>' +
        '<td></td>' +
        '<td><p id = "totalEmployee" style="color: red"></p></td>' +
        '</tr>' +
        `<tr>`   ;
    for (let i = 0; i<employees.length; i++) {
        table += `<tr>
                      <td style="font-weight: bold" ${i}>${employees[i].name}</td>
                      <td><button class="button" type="button" onclick="editEmployee(${i})">Edit</button></td>
                      <td><button class="button" type="button" onclick="deleteEmployee(${i})">Delete</button></td>
                      <td><button class="button" type="button" onclick="allInfoEmpoyeeDisplay(${i}); showdisplayEmployeeInfo()">Show all Information</button></td>
                      </tr>`
    }
    table +=  `</table>`;
    document.getElementById('employeeList').innerHTML = table;
    document.getElementById('totalEmployee').innerHTML = (employees.length+" Employees");
}
function addOneEmployee() {
    let name = correctName(document.getElementById('newEmployee').value);
    if (checkDuplicateAndNullEmployeeName(name)) {
        name = new Employee(name);
        employees.push(name);
        employees.sort((n1,n2) => (n1.name > n2.name) ?1 : (n1.name < n2.name) ? -1 : 0);
        console.log(employees);
        displayAddNewEmployee();
    } else {
        alert("This name is already added or name can't be empty or includes number")
    }
}
function addSeveralEmployees() {
    let a = parseInt(prompt("Please input how many employees you want to add"));
    for (let i = 0; i < a;) {
        let name = correctName(prompt("Please input the numer " + (i + 1) + " employee name"));
        if (checkDuplicateAndNullEmployeeName(name)) {
            name = new Employee(name);
            employees.push(name);
            employees.sort((n1,n2) => (n1.name > n2.name) ? 1 : (n1.name < n2.name) ? -1 : 0);
            i++;
        } else {
            alert("This name is already added or name can't be empty or includes number")
        }
    }
    displayAddNewEmployee();
}
function editEmployee(i){
    showEditEmployeeInformation();
    tempEmployee = i;
    document.getElementById('containOfEditEmployeeInfo').innerHTML = `<h2>Please fill some information about the employee</h2>
    <table>
        <tr>
            <th style="text-align: right"><label for="name2">Full name</label></th>
            <td style="text-align: left"><input id="name2" type="text" value = ${employees[i].getName()}></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="identityNumber2">Identity number</label></th>
            <td style="text-align: left"><input id="identityNumber2" type="text" value= ${employees[i].getIdentityNumber()}></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="dateOfBirth2">Date of birth</label></th>
            <td style="text-align: left"><input id="dateOfBirth2" type="date" value="${employees[i].getDateOfBirth()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="email2">Email</label></th>
            <td style="text-align: left"><input id="email2" type="text" value="${employees[i].getEmail()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="address2">Address</label></th>
            <td style="text-align: left"><input id="address2" type="text" value="${employees[i].getAddress()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"> <label for="vipType2">Vip type</label></th>
            <td style="text-align: left"><input id="vipType2" type="text" placeholder="Diamond, Platinium, Gold, Silver, Member" value="${employees[i].getVipType()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="discount2">Discount</label></th>
            <td style="text-align: left"><input id="discount2" type="number" value="${employees[i].getDiscount()}">%</td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="people2">How many people<br>will stay in our resort?</label></th>
            <td style="text-align: left"><input id="people2" type="number" value="${employees[i].getPeope()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="rentDay2">Rent day</label></th>
            <td style="text-align: left"><input id="rentDay2" type="number" value="${employees[i].getRentDay()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"><label for="serviceType2">Service type</label></th>
            <td style="text-align: left"><input id="serviceType2" type="text" placeholder="Villa, House, Room" value="${employees[i].getServiceType()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"> <label for="roomType2">Room Type</label></th>
            <td style="text-align: left"><input id="roomType2" type="text" placeholder="Vip, Business, Normal" value="${employees[i].getRoomType()}"></td>
        </tr>
        <tr>
            <th style="text-align: right"> <label for="position">Position</label></th>
            <td style="text-align: left"><input id="position" type="text" placeholder="Manager, Sale, Marketing" value="${employees[i].getPosition()}"></td>
        </tr>
    </table>
    <button onclick="getInfoEmployee(); submitEmployee(tempEmployee); showdisplayEmployeeInfo()" ; style="position: absolute;left: 300px; top: 450px">Submit</button>`;
}
function allInfoEmpoyeeDisplay(i) {
    let form3= `<h2 id="greeting" value=""></h2>
    <table class="table">
        <tr>
            <th style="text-align: right">Full name: </th>
            <td style="text-align: left" id="profileName"><input id="name2" type="text" readonly value = ${employees[i].name}></td>
        </tr>
        <tr>
            <th style="text-align: right">Identity number: </th>
            <td style="text-align: left" ><input type="text" readonly value = ${employees[i].identityNumber}></td>
        </tr>
        <tr>
            <th style="text-align: right">Age: </th>
            <td style="text-align: left" id="profileAge"><input type="text" readonly value = ${employees[i].getAge()}></td>
        </tr>
        <tr>
            <th style="text-align: right">Email: </th>
            <td style="text-align: left" id="profileEmail"><input type="text" readonly value = ${employees[i].email}></td>
        </tr>
        <tr>
            <th style="text-align: right">Address: </th>
            <td style="text-align: left" id="profileAddress"><input type="text" readonly value = ${employees[i].address}></td>
        </tr>
        <tr>
            <th style="text-align: right">Vip type: </th>
            <td style="text-align: left" id="profileVipType"><input type="text" readonly value = ${employees[i].vipType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Discount: </th>
            <td style="text-align: left" id="profileDiscount"><input type="text" readonly value = ${employees[i].discount}> %</td>
        </tr>
        <tr>
            <th style="text-align: right">How many people<br>will stay in our resort?: </th>
            <td style="text-align: left" id="profileAmountPeople"><input type="text" readonly value = ${employees[i].people}></td>
        </tr>
        <tr>
            <th style="text-align: right">Rent day: </th>
            <td style="text-align: left" id="profileRentDay"><input type="text" readonly value = ${employees[i].rentDay}></td>
        </tr>
        <tr>
            <th style="text-align: right">Service type: </th>
            <td style="text-align: left" id="profileServiceType"><input type="text" readonly value = ${employees[i].serviceType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Room Type: </th>
            <td style="text-align: left" id="profileRoomType"><input type="text" readonly value = ${employees[i].roomType}></td>
        </tr>
        <tr>
            <th style="text-align: right">Estimate price: </th>
            <td style="text-align: left" id="ProfileEstimatePrice"><input type="text" readonly value = ${employees[i].totalCost()}> $</td>
        </tr>
        <tr>
            <th style="text-align: right">Salary: </th>
            <td style="text-align: left" id="Salary"><input type="text" readonly value = ${employees[i].discountposition()}> $</td>
        </tr>
    </table>`;
    tempEmployee = i;
    form3 += `<button onclick="showEditEmployeeInformation(); editEmployee(tempEmployee)" ; style="position: absolute;left: 300px; top: 680px">Edit</button>`;
    document.getElementById('containOfDisplayEmployeeInfo').innerHTML = form3;
}
function deleteEmployee(i) {
    employees.splice(i,1);
    displayAddNewEmployee();
}
function getInfoEmployee() {
    nameEmployee = correctName(document.getElementById("name2").value);
    identityNumberEmployee = document.getElementById("identityNumber2").value;
    dateOfBirthEmployee = document.getElementById("dateOfBirth2").value;
    customerAgeEmployee = (new Date().getFullYear() - new Date(dateOfBirthEmployee).getFullYear());
    emailEmployee = document.getElementById("email2").value;
    addressEmployee = correctName(document.getElementById("address2").value);
    vipTypeEmployee = correctName(document.getElementById("vipType2").value);
    discountEmployee = document.getElementById("discount2").value;
    peopleEmployee = document.getElementById("people2").value;
    rentDayEmployee = document.getElementById("rentDay2").value;
    serviceTypeEmployee = correctName(document.getElementById("serviceType2").value);
    roomTypeEmployee = correctName(document.getElementById("roomType2").value);
    position = correctName(document.getElementById("position").value);
    console.log("done getinfo");
}
function submitEmployee(i) {
    let allCorrectEmployee = true;
    if (!checkIdentityNumber(identityNumberEmployee)) {
        alert('please correct the Identity Number');
        allCorrectEmployee = false;
        showEditEmployeeInformation();
    } else if (!checkEmail(emailEmployee)) {
        alert('please correct the email address');
        allCorrectEmployee = false;
        showEditEmployeeInformation();
    } else if (!checkDiscount(discountEmployee)) {
        alert('please correct the discount value');
        allCorrectEmployee = false;
        showEditEmployeeInformation();
    } else if (!checkPeopleQuantity(peopleEmployee)) {
        alert('please correct the quantity of people');
        allCorrectEmployee = false;
        showEditEmployeeInformation();
    } else if (!checkRentDay(rentDayEmployee)) {
        alert('please correct the rent day');
        allCorrectEmployee = false;
        showEditEmployeeInformation();
    }
    console.log("done Checking");
    if (allCorrectEmployee === true) {
        employees[i].setName(nameEmployee);
        employees[i].setIdentityNumber(parseInt(identityNumberEmployee));
        employees[i].setDayOfBirth(dateOfBirthEmployee);
        employees[i].setEmail(emailEmployee);
        employees[i].setAddress(addressEmployee);
        employees[i].setViptype(vipTypeEmployee);
        employees[i].setDiscount(discountEmployee);
        employees[i].setPeople(peopleEmployee);
        employees[i].setRentDay(rentDayEmployee);
        employees[i].setServiceType(serviceTypeEmployee);
        employees[i].setRoomType(roomTypeEmployee);
        employees[i].setPosition(position);
        console.log("done submit");
        allInfoEmpoyeeDisplay(i);
    }
}
function checkDuplicateAndNullEmployeeName(name) {
    let checkName = employees.findIndex(Employee => Employee.name === name);
    return !((checkName !== -1) || (name === ""));
}