   
/* --------------Start validation for appliyingPost------------------------*/
$('#techingva').click(function() {
	var date = $('#appliyingPost').val();

	if ($.trim(date) == 0) {
		$('#appliypost').show();
		return false;
	}

});

$('[id="appliyingPost"]').on('change', function() {
	if ($(this).val() == "") {
		$('#appliypost').show();

	} else {
		$('#appliypost').hide();

	}
});  
/* --------------End validation for appliyingPost ------------------------ */

/* --------------Start validation for appliyingSub ------------------------ */
$('#techingva').click(function() {
	var date = $('#appliyingSub').val();

	if ($.trim(date) == 0) {
		$('#appliysub').show();
		return false;
	}

});

$('[id="appliyingSub"]').on('change', function() {
	if ($(this).val() == "") {
		$('#appliysub').show();

	} else {
		$('#appliysub').hide();

	}
}); 
/*--------------End validation for appliyingSub  ------------------------ */


/* --------------Start validation for First Name ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#firstn').val();
		if (input == '') {
			$('#fn').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#fn1').show();
		} else {
			$('#fn').hide();
			$('#fn1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="firstn"]').on('change', function() {
		var input = $('#firstn').val();
		if (input == '') {
			$('#fn1').hide();
			$('#fn').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#fn1').show();
			$('#fn').hide();
		} else {
			$('#fn').hide();
			$('#fn1').hide();
		}
	});
});
/* --------------End validation for First Name ------------------------ */

/* --------------Start validation for Father Name ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#fName').val();
		if (input == '') {
			$('#fan').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#fan1').show();
		} else {
			$('#fan').hide();
			$('#fan1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="fName"]').on('change', function() {
		var input = $('#fName').val();
		if (input == '') {
			$('#fan1').hide();
			$('#fan').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#fan1').show();
			$('#fan').hide();
		} else {
			$('#fan').hide();
			$('#fan1').hide();
		}
	});
});
/* --------------End validation for Father Name ------------------------ */

/* --------------Start validation for Mother Name ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#mName').val();
		if (input == '') {
			$('#man').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#man1').show();
		} else {
			$('#man').hide();
			$('#man1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="mName"]').on('change', function() {
		var input = $('#mName').val();
		if (input == '') {
			$('#man1').hide();
			$('#man').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#man1').show();
			$('#man').hide();
		} else {
			$('#man').hide();
			$('#man1').hide();
		}
	});
});
/* --------------End validation for Mother Name ------------------------ */

/* --------------Start validation for Gender ------------------------ */
$('#techingva').click(function() {
	var date = $('#gender').val();

	if ($.trim(date) == 0) {
		$('#gen').show();
		return false;
	}

});

$('[id="gender"]').on('change', function() {
	if ($(this).val() == "") {
		$('#gen').show();

	} else {
		$('#gen').hide();

	}
});
/* --------------End validation for Gender ------------------------ */

/* --------------Start validation for Date of Birth ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva')
							.click(
									function() {
										var input = $('#dob1').val();
										if (input == '') {
											$('#date').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#date1').show();
										} else {
											$('#date').hide();
											$('#date1').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="dob1"]')
							.on(
									'change',
									function() {
										var input = $('#dob1').val();
										if (input == '') {
											$('#date1').hide();
											$('#date').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#date1').show();
											$('#date').hide();
										} else {
											$('#date').hide();
											$('#date1').hide();
										}
									});
				});
/* --------------End validation for Date of Birth ------------------------ */

/* --------------Start validation for Email ID ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva')
							.click(
									function() {
										var input = $('#email').val();
										if (input == '') {
											$('#Email').show();
											return false;
										} else if (!input
												.match(/^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/)) {
											$('#Email1').show();
										} else {
											$('#Email').hide();
											$('#Email1').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="email"]')
							.on(
									'change',
									function() {
										var input = $('#email').val();
										if (input == '') {
											$('#Email1').hide();
											$('#Email').show();
										} else if (!input
												.match(/^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/)) {
											$('#Email1').show();
											$('#Email').hide();
										} else {
											$('#Email').hide();
											$('#Email1').hide();
										}
									});
				});
/* --------------End validation for Email ID ------------------------ */

/* --------------Start validation for Mobile Number------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#pnumber').val();
		if (input == '') {
			$('#pnumb').show();
			return false;
		} else if (!input.match(/^[6789][0-9]{9}$/)) {
			$('#pnumber1').show();
		} else {
			$('#pnumb').hide();
			$('#pnumber1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pnumber"]').on('change', function() {
		var input = $('#pnumber').val();
		if (input == '') {
			$('#pnumber1').hide();
			$('#pnumb').show();
		} else if (!input.match(/^[6789][0-9]{9}$/)) {
			$('#pnumber1').show();
			$('#pnumb').hide();
		} else {
			$('#pnumb').hide();
			$('#pnumber1').hide();
		}
	});
});
/* --------------End validation for Mobile Number ------------------------ */

/* --------------Start validation for District ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#dist').val();
		if (input == '') {
			$('#distc').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#dist1').show();
		} else {
			$('#distc').hide();
			$('#dist1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="dist"]').on('change', function() {
		var input = $('#dist').val();
		if (input == '') {
			$('#dist1').hide();
			$('#distc').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#dist1').show();
			$('#distc').hide();
		} else {
			$('#distc').hide();
			$('#dist1').hide();
		}
	});
});
/* --------------End validation for District ------------------------ */

/* --------------Start validation for State ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#state').val();
		if (input == '') {
			$('#states').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#state1').show();
		} else {
			$('#states').hide();
			$('#state1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="state"]').on('change', function() {
		var input = $('#state').val();
		if (input == '') {
			$('#state1').hide();
			$('#states').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#state1').show();
			$('#states').hide();
		} else {
			$('#states').hide();
			$('#state1').hide();
		}
	});
});
/* --------------End validation for State ------------------------ */

/* --------------Start validation for Pincode ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#pincode').val();
		if (input == '') {
			$('#pincodes').show();
			return false;
		} else if (!input.match(/^[0-9]{6,}$/)) {
			$('#pincode1').show();
		} else {
			$('#pincodes').hide();
			$('#pincode1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pincode"]').on('change', function() {
		var input = $('#pincode').val();
		if (input == '') {
			$('#pincode1').hide();
			$('#pincodes').show();
		} else if (!input.match(/^[0-9]{6,}$/)) {
			$('#pincode1').show();
			$('#pincodes').hide();
		} else {
			$('#pincodes').hide();
			$('#pincode1').hide();
		}
	});
});
/* --------------End validation for Pincode ------------------------ */

/* --------------Start validation for socialcategory ------------------------ */
$('#techingva').click(function() {
	var date = $('#socialcategory').val();

	if ($.trim(date) == 0) {
		$('#socialcategory1').show();
		return false;
	}

});

$('[id="socialcategory"]').on('change', function() {
	if ($(this).val() == "") {
		$('#socialcategory1').show();

	} else {
		$('#socialcategory1').hide();

	}
});
/* --------------End validation for socialcategory ------------------------ */

/* --------------Start validation for Sub-Caste ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#subcast').val();
		if (input == '') {
			$('#subcasts').show();
			return false;
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
		} else {
			$('#subcasts').hide();
			$('#subcast1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="subcast"]').on('change', function() {
		var input = $('#subcast').val();
		if (input == '') {
			$('#subcast1').hide();
			$('#subcasts').show();
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
			$('#subcasts').hide();
		} else {
			$('#subcasts').hide();
			$('#subcast1').hide();
		}
	});
});

/* --------------End validation for Sub-Caste ------------------------ */

/* --------------End validation for socialcategory ------------------------ */

/* --------------Start validation for kvcno ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#kvcn').val();
		if (input == '') {
			$('#kvcns').show();
			return false;
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
		} else {
			$('#kvcns').hide();
			$('#subcast1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="kvcn"]').on('change', function() {
		var input = $('#kvcn').val();
		if (input == '') {
			$('#subcast1').hide();
			$('#kvcns').show();
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
			$('#kvcns').hide();
		} else {
			$('#kvcns').hide();
			$('#subcast1').hide();
		}
	});
});

/* --------------Start validation for kvcdate ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#kvdate').val();
		if (input == '') {
			$('#kvdates').show();
			return false;
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
		} else {
			$('#kvdates').hide();
			$('#subcast1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="kvdate"]').on('change', function() {
		var input = $('#kvdate').val();
		if (input == '') {
			$('#subcast1').hide();
			$('#kvdates').show();
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
			$('#kvdates').hide();
		} else {
			$('#kvdates').hide();
			$('#subcast1').hide();
		}
	});
});

/* --------------Start validation for neat ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva').click(function() {
		var input = $('#neate').val();
		if (input == '') {
			$('#neates').show();
			return false;
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
		} else {
			$('#neates').hide();
			$('#subcast1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="neate"]').on('change', function() {
		var input = $('#neate').val();
		if (input == '') {
			$('#subcast1').hide();
			$('#neates').show();
		} else if (!input.match(/^[A-Za-z0-9]{2,}$/)) {
			$('#subcast1').show();
			$('#neates').hide();
		} else {
			$('#neates').hide();
			$('#subcast1').hide();
		}
	});
});

/* --------------Start validation for religion ------------------------ */
$('#techingva').click(function() {
	var date = $('#religion').val();

	if ($.trim(date) == 0) {
		$('#religion1').show();
		return false;
	}

});

$('[id="religion"]').on('change', function() {
	if ($(this).val() == "") {
		$('#religion1').show();

	} else {
		$('#religion1').hide();

	}
});
/* --------------End validation for religion ------------------------ */

/* --------------START SECONDARY EDUCATION BOARD(VII) ------------------------ */

/* --------------Start validation for Registration No ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#sslc').val();
		if (input == '') {
			$('#sslcc').show();
			return false;
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#sslc1').show();
		} else {
			$('#sslcc').hide();
			$('#sslc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="sslc"]').on('change', function() {
		var input = $('#sslc').val();
		if (input == '') {
			$('#sslc1').hide();
			$('#sslcc').show();
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#sslc1').show();
			$('#sslcc').hide();
		} else {
			$('#sslcc').hide();
			$('#sslc1').hide();
		}
	});
});
/* --------------End validation for Registration No ------------------------ */

/* --------------Start validation for Obtained Marks ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointsgiven').val();
		if (input == '') {
			$('#pointsgiven111').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointsgivens221').show();
		} else {
			$('#pointsgiven111').hide();
			$('#pointsgivens221').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointsgiven"]').on('change', function() {
		var input = $('#pointsgiven').val();
		if (input == '') {
			$('#pointsgivens221').hide();
			$('#pointsgiven111').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointsgivens221').show();
			$('#pointsgiven111').hide();
		} else {
			$('#pointsgiven111').hide();
			$('#pointsgivens221').hide();
		}
	});
});
/* --------------End validation for Obtained Marks ------------------------ */

/* --------------Start validation for Maximum Marks ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointspossible').val();
		if (input == '') {
			$('#pointspossibles222').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointspossible111').show();
		} else {
			$('#pointspossibles222').hide();
			$('#pointspossible111').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointspossible"]').on('change', function() {
		var input = $('#pointspossible').val();
		if (input == '') {
			$('#pointspossible111').hide();
			$('#pointspossibles222').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointspossible111').show();
			$('#pointspossibles222').hide();
		} else {
			$('#pointspossibles222').hide();
			$('#pointspossible111').hide();
		}
	});
});
/* --------------End validation for Maximum Marks ------------------------ */

/* --------------Start validation for Year of Passing ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva1')
							.click(
									function() {
										var input = $('#sslcyear').val();
										if (input == '') {
											$('#sslcyears').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#sslcyears1').show();
										} else {
											$('#sslcyears').hide();
											$('#sslcyears1').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="sslcyear"]')
							.on(
									'change',
									function() {
										var input = $('#sslcyear').val();
										if (input == '') {
											$('#sslcyears1').hide();
											$('#sslcyears').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#sslcyears1').show();
											$('#sslcyears').hide();
										} else {
											$('#sslcyears').hide();
											$('#sslcyears1').hide();
										}
									});
				});
/* --------------End validation for Year of Passing ------------------------ */
/* --------------Start validation for Board ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#boardUniversitysslc').val();
		if (input == '') {
			$('#boardUniversitysslcs').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitysslc1').show();
		} else {
			$('#boardUniversitysslcs').hide();
			$('#boardUniversitysslc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="boardUniversitysslc"]').on('change', function() {
		var input = $('#boardUniversitysslc').val();
		if (input == '') {
			$('#boardUniversitysslc1').hide();
			$('#boardUniversitysslcs').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitysslc1').show();
			$('#boardUniversitysslcs').hide();
		} else {
			$('#boardUniversitysslcs').hide();
			$('#boardUniversitysslc1').hide();
		}
	});
});
/* --------------End validation for Board ------------------------ */
/* --------------End validation for Board ------------------------ */
/*
 * --------------Start validation for Have you passed in kannada language
 * ------------------------
 */
$('#techingva1').click(function() {
	var date = $('#kannadaLanguage').val();

	if ($.trim(date) == 0) {
		$('#kannadaLanguage1').show();
		return false;
	}

});

$('[id="kannadaLanguage"]').on('change', function() {
	if ($(this).val() == "") {
		$('#kannadaLanguage1').show();

	} else {
		$('#kannadaLanguage1').hide();

	}
});
/*--------------End validation for Have you passed in kannada language  ------------------------ */

/* -------------- END SECONDARY EDUCATION BOARD(VII) ------------------------ */

/*
 * --------------START SECONDARY EDUCATION BOARD(X/SSLC)
 * ------------------------
 */

/* --------------Start validation for Registration No ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#sslc').val();
		if (input == '') {
			$('#sslcc').show();
			return false;
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#sslc1').show();
		} else {
			$('#sslcc').hide();
			$('#sslc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="sslc"]').on('change', function() {
		var input = $('#sslc').val();
		if (input == '') {
			$('#sslc1').hide();
			$('#sslcc').show();
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#sslc1').show();
			$('#sslcc').hide();
		} else {
			$('#sslcc').hide();
			$('#sslc1').hide();
		}
	});
});
/*--------------End validation for Registration No ------------------------ */

/*--------------Start validation for Obtained Marks  ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointsgiven').val();
		if (input == '') {
			$('#pointsgiven111').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointsgivens221').show();
		} else {
			$('#pointsgiven111').hide();
			$('#pointsgivens221').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointsgiven"]').on('change', function() {
		var input = $('#pointsgiven').val();
		if (input == '') {
			$('#pointsgivens221').hide();
			$('#pointsgiven111').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointsgivens221').show();
			$('#pointsgiven111').hide();
		} else {
			$('#pointsgiven111').hide();
			$('#pointsgivens221').hide();
		}
	});
});
/* --------------End validation for Obtained Marks ------------------------ */

/*--------------Start validation for Maximum Marks  ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointspossible').val();
		if (input == '') {
			$('#pointspossibles222').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointspossible111').show();
		} else {
			$('#pointspossibles222').hide();
			$('#pointspossible111').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointspossible"]').on('change', function() {
		var input = $('#pointspossible').val();
		if (input == '') {
			$('#pointspossible111').hide();
			$('#pointspossibles222').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#pointspossible111').show();
			$('#pointspossibles222').hide();
		} else {
			$('#pointspossibles222').hide();
			$('#pointspossible111').hide();
		}
	});
});
/*--------------End validation for Maximum Marks ------------------------ 	*/

/* --------------Start validation for Year of Passing ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva1')
							.click(
									function() {
										var input = $('#sslcyear').val();
										if (input == '') {
											$('#sslcyears').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#sslcyears1').show();
										} else {
											$('#sslcyears').hide();
											$('#sslcyears1').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="sslcyear"]')
							.on(
									'change',
									function() {
										var input = $('#sslcyear').val();
										if (input == '') {
											$('#sslcyears1').hide();
											$('#sslcyears').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#sslcyears1').show();
											$('#sslcyears').hide();
										} else {
											$('#sslcyears').hide();
											$('#sslcyears1').hide();
										}
									});
				});
/* --------------End validation for Year of Passing ------------------------ */
/* --------------Start validation for Board ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#boardUniversitysslc').val();
		if (input == '') {
			$('#boardUniversitysslcs').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitysslc1').show();
		} else {
			$('#boardUniversitysslcs').hide();
			$('#boardUniversitysslc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="boardUniversitysslc"]').on('change', function() {
		var input = $('#boardUniversitysslc').val();
		if (input == '') {
			$('#boardUniversitysslc1').hide();
			$('#boardUniversitysslcs').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitysslc1').show();
			$('#boardUniversitysslcs').hide();
		} else {
			$('#boardUniversitysslcs').hide();
			$('#boardUniversitysslc1').hide();
		}
	});
});
/* --------------End validation for Board ------------------------ */
/*
 * --------------Start validation for Have you passed in kannada language
 * ------------------------
 */
$('#techingva1').click(function() {
	var date = $('#kannadaLanguage').val();

	if ($.trim(date) == 0) {
		$('#kannadaLanguage1').show();
		return false;
	}

});

$('[id="kannadaLanguage"]').on('change', function() {
	if ($(this).val() == "") {
		$('#kannadaLanguage1').show();

	} else {
		$('#kannadaLanguage1').hide();

	}
});
/*--------------End validation for Have you passed in kannada language  ------------------------ */

/* -------------- END SECONDARY EDUCATION BOARD(X/SSLC) ------------------------ */

/*
 * --------------START PRE-UNIVERSITY EDUCATION BOARD (XII)
 * ------------------------
 */

/* --------------Start validation for Registration No ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#puc').val();
		if (input == '') {
			$('#pucs').show();
			return false;
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#puc1').show();
		} else {
			$('#pucs').hide();
			$('#puc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="puc"]').on('change', function() {
		var input = $('#puc').val();
		if (input == '') {
			$('#puc1').hide();
			$('#pucs').show();
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#puc1').show();
			$('#pucs').hide();
		} else {
			$('#pucs').hide();
			$('#puc1').hide();
		}
	});
});
/* --------------End validation for Registration No ------------------------ */

/* --------------Start validation for Obtained Marks ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointsgiven1').val();
		if (input == '') {
			$('#obtainedpuc1').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#obtainedpuc11').show();
		} else {
			$('#obtainedpuc1').hide();
			$('#obtainedpuc11').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointsgiven1"]').on('change', function() {
		var input = $('#pointsgiven1').val();
		if (input == '') {
			$('#obtainedpuc11').hide();
			$('#obtainedpuc1').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#obtainedpuc11').show();
			$('#obtainedpuc1').hide();
		} else {
			$('#obtainedpuc1').hide();
			$('#obtainedpuc11').hide();
		}
	});
});
/* --------------End validation for Obtained Marks ------------------------ */

/*--------------Start validation for Maximum Marks  ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#pointspossible1').val();
		if (input == '') {
			$('#maximumpucs').show();
			return false;
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#maximumpuc1').show();
		} else {
			$('#maximumpucs').hide();
			$('#maximumpuc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="pointspossible1"]').on('change', function() {
		var input = $('#pointspossible1').val();
		if (input == '') {
			$('#maximumpuc1').hide();
			$('#maximumpucs').show();
		} else if (!input.match(/^[0-9.]*$/)) {
			$('#maximumpuc1').show();
			$('#maximumpucs').hide();
		} else {
			$('#maximumpucs').hide();
			$('#maximumpuc1').hide();
		}
	});
});
/* --------------End validation for Maximum Marks ------------------------ */

/* --------------Start validation for Year of Passing ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva1')
							.click(
									function() {
										var input = $('#pucyear1').val();
										if (input == '') {
											$('#pucyears').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#pucyears1').show();
										} else {
											$('#pucyears').hide();
											$('#pucyears1').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="pucyear1"]')
							.on(
									'change',
									function() {
										var input = $('#pucyear1').val();
										if (input == '') {
											$('#pucyears1').hide();
											$('#pucyears').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#pucyears1').show();
											$('#pucyears').hide();
										} else {
											$('#pucyears').hide();
											$('#pucyears1').hide();
										}
									});
				});
/* --------------End validation for Year of Passing ------------------------ */
/* --------------Start validation for Board ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#boardUniversitypuc').val();
		if (input == '') {
			$('#boardUniversitypucs').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitypuc1').show();
		} else {
			$('#boardUniversitypucs').hide();
			$('#boardUniversitypuc1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="boardUniversitypuc"]').on('change', function() {
		var input = $('#boardUniversitypuc').val();
		if (input == '') {
			$('#boardUniversitypuc1').hide();
			$('#boardUniversitypucs').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitypuc1').show();
			$('#boardUniversitypucs').hide();
		} else {
			$('#boardUniversitypucs').hide();
			$('#boardUniversitypuc1').hide();
		}
	});
});
/* --------------End validation for Board ------------------------ */

/*-------------- END PRE-UNIVERSITY EDUCATION BOARD (XII) ------------------------ 	*/

/*--------------START BACHELOR'S DEGREE ------------------------ 	*/

/* --------------Start validation for Degree Name ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#degreeNameBachelors').val();
		if (input == '') {
			$('#degreeNameBachelorss').show();
			return false;
		} else if (!input.match(/^[A-Za-z.,]{2,}|[\s]$/)) {
			$('#degreeNameBachelors1').show();
		} else {
			$('#degreeNameBachelorss').hide();
			$('#degreeNameBachelors1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="degreeNameBachelors"]').on('change', function() {
		var input = $('#degreeNameBachelors').val();
		if (input == '') {
			$('#degreeNameBachelors1').hide();
			$('#degreeNameBachelorss').show();
		} else if (!input.match(/^[A-Za-z.,]{2,}|[\s]$/)) {
			$('#degreeNameBachelors1').show();
			$('#degreeNameBachelorss').hide();
		} else {
			$('#degreeNameBachelorss').hide();
			$('#degreeNameBachelors1').hide();
		}
	});
});
/*--------------End validation for Degree Name ------------------------ */

/* --------------Start validation for Registration No ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#bachelorsDegree').val();
		if (input == '') {
			$('#bachelorsDegrees').show();
			return false;
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#bachelorsDegree1').show();
		} else {
			$('#bachelorsDegrees').hide();
			$('#bachelorsDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="bachelorsDegree"]').on('change', function() {
		var input = $('#bachelorsDegree').val();
		if (input == '') {
			$('#bachelorsDegree1').hide();
			$('#bachelorsDegrees').show();
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#bachelorsDegree1').show();
			$('#bachelorsDegrees').hide();
		} else {
			$('#bachelorsDegrees').hide();
			$('#bachelorsDegree1').hide();
		}
	});
});
/*--------------End validation for Registration No ------------------------ */

/*
 * --------------Start validation for Percentage of Marks
 * ------------------------
 */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#percentagebachelorsDegree').val();
		if (input == '') {
			$('#percentagebachelorsDegrees').show();
			return false;
		} else if (!input.match(/^[0-9.%]*$/)) {
			$('#percentagebachelorsDegree1').show();
		} else {
			$('#percentagebachelorsDegrees').hide();
			$('#percentagebachelorsDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="percentagebachelorsDegree"]').on('change', function() {
		var input = $('#percentagebachelorsDegree').val();
		if (input == '') {
			$('#percentagebachelorsDegree1').hide();
			$('#percentagebachelorsDegrees').show();
		} else if (!input.match(/^[0-9.%]*$/)) {
			$('#percentagebachelorsDegree1').show();
			$('#percentagebachelorsDegrees').hide();
		} else {
			$('#percentagebachelorsDegrees').hide();
			$('#percentagebachelorsDegree1').hide();
		}
	});
});
/*--------------End validation for Percentage of Marks ------------------------ 	*/

/* --------------Start validation for Year of Passing ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva1')
							.click(
									function() {
										var input = $('#bachelorsDegreeyear1')
												.val();
										if (input == '') {
											$('#bachelorsDegreeyear1s').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#bachelorsDegreeyear11').show();
										} else {
											$('#bachelorsDegreeyear1s').hide();
											$('#bachelorsDegreeyear11').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="bachelorsDegreeyear1"]')
							.on(
									'change',
									function() {
										var input = $('#bachelorsDegreeyear1')
												.val();
										if (input == '') {
											$('#bachelorsDegreeyear11').hide();
											$('#bachelorsDegreeyear1s').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#bachelorsDegreeyear11').show();
											$('#bachelorsDegreeyear1s').hide();
										} else {
											$('#bachelorsDegreeyear1s').hide();
											$('#bachelorsDegreeyear11').hide();
										}
									});
				});
/* --------------End validation for Year of Passing ------------------------ */
/* --------------Start validation for University ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#boardUniversitybachelorsDegree').val();
		if (input == '') {
			$('#boardUniversitybachelorsDegrees').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitybachelorsDegree1').show();
		} else {
			$('#boardUniversitybachelorsDegrees').hide();
			$('#boardUniversitybachelorsDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="boardUniversitybachelorsDegree"]').on('change', function() {
		var input = $('#boardUniversitybachelorsDegree').val();
		if (input == '') {
			$('#boardUniversitybachelorsDegree1').hide();
			$('#boardUniversitybachelorsDegrees').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitybachelorsDegree1').show();
			$('#boardUniversitybachelorsDegrees').hide();
		} else {
			$('#boardUniversitybachelorsDegrees').hide();
			$('#boardUniversitybachelorsDegree1').hide();
		}
	});
});
/*--------------End validation for University ------------------------ */

/*-------------- END BACHELOR'S DEGREE ------------------------ 	*/

/*--------------START MASTER'S DEGREE ------------------------ 	*/
/* --------------Start validation for Degree Name ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#subjectMaster').val();
		if (input == '') {
			$('#subjectMasters').show();
			return false;
		} else if (!input.match(/^[A-Za-z.,]{2,}|[\s]$/)) {
			$('#subjectMaster1').show();
		} else {
			$('#subjectMasters').hide();
			$('#subjectMaster1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="subjectMaster"]').on('change', function() {
		var input = $('#subjectMaster').val();
		if (input == '') {
			$('#subjectMaster1').hide();
			$('#subjectMasters').show();
		} else if (!input.match(/^[A-Za-z.,]{2,}|[\s]$/)) {
			$('#subjectMaster1').show();
			$('#subjectMasters').hide();
		} else {
			$('#subjectMasters').hide();
			$('#subjectMaster1').hide();
		}
	});
});
/*-------End validation for Degree Name ------------------------*/

/* --------------Start validation for Registration No ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#mastersDegree').val();
		if (input == '') {
			$('#mastersDegrees').show();
			return false;
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#mastersDegree1').show();
		} else {
			$('#mastersDegrees').hide();
			$('#mastersDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="mastersDegree"]').on('change', function() {
		var input = $('#mastersDegree').val();
		if (input == '') {
			$('#mastersDegree1').hide();
			$('#mastersDegrees').show();
		} else if (!input.match(/^[a-zA-Z0-9_.-]*$/)) {
			$('#mastersDegree1').show();
			$('#mastersDegrees').hide();
		} else {
			$('#mastersDegrees').hide();
			$('#mastersDegree1').hide();
		}
	});
});
/* --------------End validation for Registration No ------------------------ */

/*
 * --------------Start validation for Percentage of Marks
 * ------------------------
 */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#percentagemastersDegree').val();
		if (input == '') {
			$('#percentagemastersDegrees').show();
			return false;
		} else if (!input.match(/^[0-9.%]*$/)) {
			$('#percentagemastersDegree1').show();
		} else {
			$('#percentagemastersDegrees').hide();
			$('#percentagemastersDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="percentagemastersDegree"]').on('change', function() {
		var input = $('#percentagemastersDegree').val();
		if (input == '') {
			$('#percentagemastersDegree1').hide();
			$('#percentagemastersDegrees').show();
		} else if (!input.match(/^[0-9.%]*$/)) {
			$('#percentagemastersDegree1').show();
			$('#percentagemastersDegrees').hide();
		} else {
			$('#percentagemastersDegrees').hide();
			$('#percentagemastersDegree1').hide();
		}
	});
});
/*------------End validation for Percentage of Marks ------------------------ 	*/

/* --------------Start validation for Year of Passing ------------------------ */
$(document)
		.ready(
				function() {
					// alert("hi")
					$('#techingva1')
							.click(
									function() {
										var input = $('#mastersDegreeyear1')
												.val();
										if (input == '') {
											$('#mastersDegreeyear1s').show();
											return false;
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#mastersDegreeyear11').show();
										} else {
											$('#mastersDegreeyear1s').hide();
											$('#mastersDegreeyear11').hide();
										}
									});
				});
$(document)
		.ready(
				function() {
					$('[id="mastersDegreeyear1"]')
							.on(
									'change',
									function() {
										var input = $('#mastersDegreeyear1')
												.val();
										if (input == '') {
											$('#mastersDegreeyear11').hide();
											$('#mastersDegreeyear1s').show();
										} else if (!input
												.match(/^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$/)) {
											$('#mastersDegreeyear11').show();
											$('#mastersDegreeyear1s').hide();
										} else {
											$('#mastersDegreeyear1s').hide();
											$('#mastersDegreeyear11').hide();
										}
									});
				});
/* --------------End validation for Year of Passing ------------------------ */
/*--------------Start validation for University ------------------------ */
$(document).ready(function() {
	// alert("hi")
	$('#techingva1').click(function() {
		var input = $('#boardUniversitymastersDegree').val();
		if (input == '') {
			$('#boardUniversitymastersDegrees').show();
			return false;
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitymastersDegree1').show();
		} else {
			$('#boardUniversitymastersDegrees').hide();
			$('#boardUniversitymastersDegree1').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="boardUniversitymastersDegree"]').on('change', function() {
		var input = $('#boardUniversitymastersDegree').val();
		if (input == '') {
			$('#boardUniversitymastersDegree1').hide();
			$('#boardUniversitymastersDegrees').show();
		} else if (!input.match(/^[A-Za-z]{3,}|[\s]$/)) {
			$('#boardUniversitymastersDegree1').show();
			$('#boardUniversitymastersDegrees').hide();
		} else {
			$('#boardUniversitymastersDegrees').hide();
			$('#boardUniversitymastersDegree1').hide();
		}
	});
});
/* --------------End validation for University ------------------------ */

/* -------------- END MASTER'S DEGREE ------------------------ */

/* -------------- Start UPLOAD DOCUMENTS ------------------------ */

/* --------------Start validation for Upload Picture ------------------------ */

$('#techingva2').click(function() {
	var date = $('#file').val();
	if ($.trim(date) == 0) {
		$('#picture1').show();
		return false;
	}
});

$('[id="file"]').on('change', function() {
	if ($(this).val() == "") {
		$('#picture1').show();
	} else {
		$('#picture1').hide();
	}
});

/* --------------End validation for Upload Picture ------------------------ */
/* --------------Start validation for Upload Signature ------------------------ */
$('#techingva2').click(function() {
	var date = $('#files1').val();
	if ($.trim(date) == 0) {
		$('#signature1').show();
		return false;
	}
});

$('[id="files1"]').on('change', function() {
	if ($(this).val() == "") {
		$('#signature1').show();
	} else {
		$('#signature1').hide();
	}
});

/*--------------End validation for Upload Signature ------------------------ */
/*--------------Start validation for Upload SSLC(X) Marks Sheet ------------------------ */
$('#techingva2').click(function() {
	var date = $('#files2').val();
	if ($.trim(date) == 0) {
		$('#sslcMarksSheet1').show();
		return false;
	}
});

$('[id="files2"]').on('change', function() {
	if ($(this).val() == "") {
		$('#sslcMarksSheet1').show();
	} else {
		$('#sslcMarksSheet1').hide();
	}
});

/*
 * --------------End validation for Upload SSLC(X) Marks Sheet
 * ------------------------
 */
/*
 * --------------Start validation for Upload PUC(XII) Marks Sheet
 * ------------------------
 */
$('#techingva2').click(function() {
	var date = $('#files3').val();
	if ($.trim(date) == 0) {
		$('#pucMarksSheet1').show();
		return false;
	}
});

$('[id="files3"]').on('change', function() {
	if ($(this).val() == "") {
		$('#pucMarksSheet1').show();
	} else {
		$('#pucMarksSheet1').hide();
	}
});

/*--------------End validation for Upload PUC(XII) Marks Sheet ------------------------ */
/*
 * --------------Start validation for Upload Bachelor's Final Year Marks
 * Sheet------------------------
 */
$('#techingva2').click(function() {
	var date = $('#files4').val();
	if ($.trim(date) == 0) {
		$('#bachelorsMarksSheet1').show();
		return false;
	}
});

$('[id="files4"]').on('change', function() {
	if ($(this).val() == "") {
		$('#bachelorsMarksSheet1').show();
	} else {
		$('#bachelorsMarksSheet1').hide();
	}
});

/*
 * --------------Start validation for Upload Bachelor's Final Year Marks
 * Sheet------------------------
 */
$('#techingva2').click(function() {
	var date = $('#files45').val();
	if ($.trim(date) == 0) {
		$('#ugPDC').show();
		return false;
	}
});

$('[id="files45"]').on('change', function() {
	if ($(this).val() == "") {
		$('#ugPDC').show();
	} else {
		$('#ugPDC').hide();
	}
});

/*--------------End validation for Upload Bachelor's Final Year Marks Sheet ------------------------*/

/*--------------Start validation for Upload Master's Final Year Marks Sheet ------------------------ */
$('#techingva2').click(function() {
	var date = $('#files5').val();
	if ($.trim(date) == 0) {
		$('#masterMarksSheet1').show();
		return false;
	}
});

$('[id="files5"]').on('change', function() {
	if ($(this).val() == "") {
		$('#masterMarksSheet1').show();
	} else {
		$('#masterMarksSheet1').hide();
	}
});

/*--------------End validation for Upload Master's Final Year Marks Sheet ------------------------ */

/*--------------Start validation for Upload Master's Provisional Degree Certificate ------------------------ */
$('#techingva2').click(function() {
	var date = $('#files55').val();
	if ($.trim(date) == 0) {
		$('#pgmPDC').show();
		return false;
	}
});

$('[id="files55"]').on('change', function() {
	if ($(this).val() == "") {
		$('#pgmPDC').show();
	} else {
		$('#pgmPDC').hide();
	}
});

/*--------------End validation for Upload Master's Provisional Degree Certificate ------------------------ */

/*--------------Start validation for Upload KVC Certificate front page------------------------ */
$('#techingva2').click(function() {
	var date = $('#files14').val();
	if ($.trim(date) == 0) {
		$('#kvc').show();
		return false;
	}
});

$('[id="files14"]').on('change', function() {
	if ($(this).val() == "") {
		$('#kvc').show();

	} else {
		$('#kvc').hide();
	}
});
/*--------------Start validation for Upload KVC Certificate back page------------------------ */
$('#techingva2').click(function() {
	var date = $('#files144').val();
	if ($.trim(date) == 0) {
		$('#kvcb').show();
		return false;
	}
});

$('[id="files144"]').on('change', function() {
	if ($(this).val() == "") {
		$('#kvcb').show();
	} else {
		$('#kvcb').hide();
	}
});
/*--------------End validation for Upload KVC Certificate back page ------------------------ */

/*-------------- Start UPLOAD DOCUMENTS ------------------------ 		*/