var url = "http://localhost:8081/laundry-management-system/";
const setUrl = parameter => {
	url = url + parameter;
}
function validation() {
	let flag = true;
	if (document.Formfill.Fullname.value == "") {
		document.getElementById("result").innerHTML = "Enter Fullname*";
		flag = false;
	}
	else if (document.Formfill.Fullname.value.length < 6) {
		document.getElementById("result").innerHTML = "Atleast six letter*";
		flag = false;
	}
	else if (document.Formfill.Email.value == "") {
		document.getElementById("result").innerHTML = "Enter your Email*";
		flag = false;
	}
	else if (document.Formfill.Mobilenumber.value == "") {
		document.getElementById("result").innerHTML = "Enter your mobile number*";
		flag = false;
	}
	else if (document.Formfill.Mobilenumber.value.length < 10 || document.Formfill.Mobilenumber.value.length > 10) {
		document.getElementById("result").innerHTML = " mobile number must be 10-digits";
		flag = false;
	}
	else if (document.Formfill.Password.value == "") {
		document.getElementById("result").innerHTML = "Enter your password*";
		flag = false;
	}


	if (flag) {
		const formData = new FormData();
		formData.append('Fullname', document.Formfill.Fullname.value);
		formData.append('Email', document.Formfill.Email.value);
		formData.append('Mobilenumber', document.Formfill.Mobilenumber.value);
		formData.append('Password', document.Formfill.Password.value);
		console.log("Password: ", document.Formfill.Password.value);
		let queryStr = new URLSearchParams(formData).toString();
		setUrl("signup?" + queryStr);
		console.log(url);
		document.getElementById("final_save").href = url;
		popup.classList.add("open-slide")
		flag = false;
	}
	return flag;
}
var popup = document.getElementById('popup');

function CloseSlide() {
	popup.classList.remove("open-slide");
}