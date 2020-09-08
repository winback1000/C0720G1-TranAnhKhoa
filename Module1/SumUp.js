// Sửa tên không có số
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
// Check CMND 8 số
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
// Check email
function checkEmail(string) {
    return !((string.indexOf('@') !== string.lastIndexOf('@')) ||
        (string.lastIndexOf('.') < string.indexOf('@')) ||
        (string.indexOf(' ') !== -1));
}
// Add objects to array and sort
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
// Add several objects to array and sort
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
// Delete an element in array at position i
function deleteProduct(array,i) {
    array.splice(i, 1);
}
// look for index of an object with name in array
function nameLocation(name) {
    return names.findIndex(Customer => Customer.name === name);
}
// Check dulicate name and null name of objects in an array
function checkDuplicateAndNullEmployeeName(name) {
    let checkName = employees.findIndex(Employee => Employee.name === name);
    return !((checkName !== -1) || (name === ""));
}
// return a number to 2 decimal number
var num = 5.56789;
var n = num.toFixed(2);

// hàm kiểm tra email
function kiemTraEmail(email) {
    let regex =/^\w{3,}@[a-zA-Z]{3,5}\.[a-zA-Z]{2,3}$/;
    return regex.test(email);
}
//** Các hàm dưới làm thêm cho mọi người nếu cần thiết có thể dùng
// hàm kiểm tra ngày tháng (dd/mm/yyyy) ( ngay 01-31, tháng từ 01-12, năm 1900 đến 2020)
function kiemTraNgayThang(ngayThangNam) {
    let regex =/^((0[1-9])|([1-2][0-9])|(3[0-1]))\/(([0][1-9])|1[0-2])\/(19[0-9]{2}|20[0-1][0-9]|2020)$/;
    return regex.test(ngayThangNam);
}
// hàm định dạng tháng/năm (mm/yyyy) (tháng từ 01-12, năm 1900 đến 2999) .chú ý kiểm tra kỹ xem đúng chưa
function kiemTraNgayThang(thangNam) {
    let regex =/^(([0][1-9])|1[0-2])\/(19[0-9]{2}|2[0-9]{3})$/;
    return regex.test(thangNam);
}
// hàm kiểm tra mã nhân viên định dạng (MNV-XXXX) , Bắt đầu bằng "MNV-", tiếp theo X là dạng số từ 0-9 (gồm 4 số)
function kiemTraMaNhaVien(maNV) {
    let regex =/^MNV-[0-9]{4}$/;
    return regex.test(maNV);
}
// sap xep mang theo thu tu giam dan
function bai8() {
    let array8 = new Array(10);
    for (i = 0; i < 10; i++) {
        array8[i] = parseInt(prompt("vui long nhap so thu " + (i + 1)));
    }
    console.log(array8);
    let array82= [];
    for (i = 0; i<10;i++) {
        let min = array8[0];
        for (j=0;j<array8.length;j++) {
            if (array8[j] <= min) {
                min = array8[j];
            }
        }
        array82.push(min);
        array8.splice(array8.indexOf(min),1);
        console.log(array8)
    }
    console.log(array82);
}