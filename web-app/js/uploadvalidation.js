
	/*------------------------------Doc10------------------------------*/
		var title = $( "#files110" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files110').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 100; //100MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert110').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert110').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert110').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert110').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		


	
		

/*------------------------------Upload Picture------------------------------*/
	
    var title = $( "#file" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#file').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

		
		
		

		/*------------------------------Upload Signature------------------------------*/
	
   var title = $( "#files1" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files1').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert1').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert1').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert1').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert1').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

	
		
		
		
		
/*------------------------------Upload SSLC(X) Marks Sheet------------------------------*/
	
   var title = $( "#files2" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files2').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert23').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert23').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert23').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert23').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		/*------------------------------Upload PUC(XII) Marks Sheet------------------------------*/
	
   var title = $( "#files3" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files3').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert3').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert3').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert3').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert3').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		/*------------------------------Upload Bachelor's Final Year Marks Shee------------------------------*/
	
   var title = $( "#files4" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files4').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert4').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert4').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert4').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert4').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		/*------------------------------Upload Bachelor's provisional certificate------------------------------*/
	
   var title = $( "#files45" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files45').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert45').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert45').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert45').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert45').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		/*------------------------------Upload Master's Final Year Marks Sheet------------------------------*/
	
   var title = $( "#files5" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files5').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert5').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert5').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert5').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert5').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
		
		/*------------------------------Upload Master's Provisional degree certificate------------------------------*/
	
   var title = $( "#files55" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files55').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert55').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert55').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert55').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert55').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
		
		/*------------------------------Upload  PHD certificate------------------------------*/
	
   var title = $( "#files66" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files66').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert66').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert66').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert66').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert66').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
		
		/*------------------------------Upload provisional PHD certificate------------------------------*/
	
   var title = $( "#files77" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files77').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert77').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert77').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert77').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert77').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
	
		
		/*------------------------------Upload Caste Income Certificate------------------------------*/
			
		 var title = $( "#files99" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files99').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert99').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert99').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert99').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert99').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
	
  
		
	/*------------------------------Upload Rural Certificate------------------------------*/
 var title = $( "#filesrc" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesrc').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertrc').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertrc').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertrc').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertrc').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})		
		
		

		
		/*------------------------------Upload Ex-Servicemen Certificate------------------------------*/
	
   var title = $( "#files10" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files10').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert10').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert10').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert10').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert10').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		/*------------------------------Upload Kannada Medium Certificate------------------------------*/
	
   var title = $( "#files11" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files11').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert11').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert11').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert11').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert11').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
	/*------------------------------Upload Kalyana-Karnataka (371J) Certificate------------------------------*/
	
   var title = $( "#files12" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files12').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert12').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert12').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert12').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert12').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		
/*------------------------------Upload KVC Certificate------------------------------*/
		
var title = $( "#files14" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files14').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertkf').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertkf').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertkf').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertkf').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
	
		
		/*------------------------------Upload KVC Certificate BACK-----------------------------*/
		
var title = $( "#files144" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files144').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertkb').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertkb').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertkb').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertkb').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		

		/*------------------------------Upload Person with Disability (PWD) Certificate------------------------------*/
	
   var title = $( "#files13" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files13').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert13').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert13').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert13').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert13').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		
		
		
		
		/*------------------------------Upload EXPERIENCE CERTIFICATE-----------------------------*/
	
   var title = $( "#files155" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files155').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert155').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert155').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert155').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert155').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		/*------------------------------Upload NET CERTIFICATE-----------------------------*/
	
   var title = $( "#files1net" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files1net').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert155').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert155').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert155').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert155').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
	
	
		