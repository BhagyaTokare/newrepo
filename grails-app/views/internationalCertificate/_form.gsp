<%@ page import="com.hiideals.form.InternationalCertificate" %>

<div class="row m-4">

    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="lastName">Title</label><br/>
        <select class="form-select" name="lastName" value="${internationalCertificateInstance?.lastName}" style="border:1px solid black;" aria-label="Default select example">
            <option selected>Select</option>
            <option value="Rtn.">Rtn.</option>
        </select>
    </div>

    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="firstName">Full Name (used in certificate)</label>
        <input type="text" class="form-control" maxlength="30" name="firstName" value="${internationalCertificateInstance?.firstName}" style="border:1px solid black;" id="firstName" placeholder="Full name" required />
    </div>

    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="clubMembershipNo">Club Membership Number:(optional)</label>
        <input type="text" class="form-control" name="clubMembershipNo" value="${internationalCertificateInstance?.clubMembershipNo}" style="border:1px solid black;" id="clubMembershipNo" maxlength="10" placeholder="Club Membership Number"  />
    </div>

    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="districtCode">District:</label><br/>
        <select class="form-select" name="districtCode" value="${internationalCertificateInstance?.districtCode}" style="border:1px solid black;" aria-label="Default select example">
            <option selected>Select</option>
            <option value="3160">3160</option>
        </select>
    </div>

		
		
    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="zone">Zone:</label><br/>
        <select class="form-select" name="zone" value="${internationalCertificateInstance?.zone}" id="zone" style="border:1px solid black;" aria-label="Default select example" onchange="updateClubs()">
            <option selected>Select</option>
            <option value="SIMHAPURI ">SIMHAPURI </option>
            <option value="KALYAN ">KALYAN </option>
            <option value="COASTAL ">COASTAL </option>
            <option value="PINAKINI ">PINAKINI </option>
            <option value="MAHANANDI ">MAHANANDI </option>
            <option value="TUNGABHADRA ">TUNGABHADRA </option>
            <option value="SATYASAI ">SATYASAI </option>
            <option value="VIJAYANAGARA ">VIJAYANAGARA </option>
            <option value="CHINMULADRI ">CHINMULADRI </option>
            <option value="DAVANAGERE ">DAVANAGERE </option>
            <option value="MAHALAXMI">MAHALAXMI </option>
            <option value="NRUPATUNGA">NRUPATUNGA </option>
        </select>
    </div>

    <div class="form-group col-md-4">
        <label style="font-size: 20px;" for="club">Club:</label><br/>
        <select class="form-select" name="club" value="${internationalCertificateInstance?.club}" id="clubs" style="border:1px solid black;" aria-label="Default select example">
            <option selected>Select</option>
            <!-- Clubs will be populated here based on the selected zone -->
        </select>
    </div>
<div class="form-group col-md-4">
    <label style="font-size: 20px;" for="phoneNo">WhatsApp Mobile Number:</label>
    <input type="text" class="form-control" name="phoneNo" value="${internationalCertificateInstance?.phoneNo}" id="phoneNo" style="border:1px solid black;" maxlength="10" placeholder="WhatsApp Mobile Number" required />
  <g:fieldError bean="${internationalCertificateInstance}" field="phoneNo" style="color: red;" />
</div>

</div>

<script>
    function updateClubs() {
        var zone = document.getElementById("zone").value;
        var clubsSelect = document.getElementById("clubs");

        // Clear current clubs options
        clubsSelect.innerHTML = '<option selected>Select</option>';

        // Define clubs for each zone
        var clubsOptions = {
        		 "SIMHAPURI ": [
        		                    "RC Nellore",
        		                    "RC Nellore South",
        		                    "RC Nellore Shakthi",
        		                    "RC Kavali",
        		                    "RC Venkatagiri",
        		                    "RC Nellore Avenue"
        		                ],
        		                "KALYAN ": [
        		                    "RC Bidar",
        		                    "RC Bidar Fort",
        		                    "RC Bidar New Century",
        		                    "RC Bidar Queens",
        		                    "RC Bidar Silverstar",
        		                    "RC Bhalki Fort",
        		                    "RC Bhalki Manjra",
        		                    "RC Humanabad Elite",
        		                    "RC Basavakalyan"
        		                ],
        		                "COASTAL ": [
        		                    "RC Gudur",
        		                    "RC Gudur West",
        		                    "RC Naidupeta",
        		                    "RC Sullurpeta",
        		                    "RC Kota"
        		                ],
        		                "PINAKINI ": [
        		                    "RC Proddatur",
        		                    "RC Proddatur Mid Town",
        		                    "RC Jammalamadugu",
        		                    "RC Rayachoty",
        		                    "RC Annamaiah Rajampeta",
        		                    "RC Kadapa",
        		                    "RC Madhavaram"
        		                ],
        		                "MAHANANDI ": [
        		                    "RC Nandyal",
        		                    "RC Nandyal Mid Town",
        		                    "RC Navanandi",
        		                    "RC Allagadda Satabdhi",
        		                    "RC Banaganepalli",
        		                    "RC Koyalakuntla"
        		                ],
        		                "TUNGABHADRA ": [
        		                    "RC Adoni",
        		                    "RC Dhone",
        		                    "RC Bethamcherla",
        		                    "RC Greater Kurnool",
        		                    "RC Kurnool New City",
        		                    "RC Yemmiganur"
        		                ],
        		                "SATYASAI ": [
        		                    "RC Anantapur",
        		                    "RC Anantapur Central",
        		                    "RC Guntakal",
        		                    "RC Tadipatri",
        		                    "RC Kadiri",
        		                    "RC Dharmavaram Mid Town",
        		                    "RC Madakasira",
        		                    "RC Hindupur"
        		                ],
        		                "VIJAYANAGARA ": [
        		                    "RC Hospet",
        		                    "RC Vijayanagara Heritage",
        		                    "RC Koppal",
        		                    "RC Hampi Pearls",
        		                    "RC Bellary",
        		                    "RC Bellary Contonment",
        		                    "RC Gangavathi Central",
        		                    "RC Sandur"
        		                ],
        		                "CHINMULADRI ": [
        		                    "RC Hiryur",
        		                    "RC Challakere",
        		                    "RC Holalkere",
        		                    "RC Chitradurga",
        		                    "RC Chitradurga Fort",
        		                    "RC Chinmuladri"
        		                ],
        		                "DAVANAGERE ": [
        		                    "RC Davanagere",
        		                    "RC Davanagere South",
        		                    "RC Davanagere Mid Town",
        		                    "RC Davanagere Vidyanagar",
        		                    "RC Chickjajur"
        		                ],
        		                "NRUPATUNGA":[
        	             		                "RC Gulbarga", 
        	             		                "RC Gulbarga North",
        	             		                "RC Gulbarga Mid Town ",
        	             		                "RC Gulbarga Suncity",
        	             		                "RC Gulbarga South",
        	             		                "RC Gulbarga Sakhi"
        	             		                 ],
        		                "MAHALAXMI": [
             		                "RC Diamond Devadurga", 
             		                "RC Raichur",
             		                "RC Raichur Central",
             		                "RC Raichur Cotton City",
             		                "RC Raichur East",
             		                "RC Raichur Krishnathunge",
             		                "RC Raichur Shakthinagar",
             		                "RC Sindhanoor"
             		                 ]
             		       
             		               
        		            };
                            
               
        // Populate clubs based on the selected zone
        if (zone in clubsOptions) {
            var clubs = clubsOptions[zone];
            clubs.forEach(function(club) {
                var option = document.createElement("option");
                option.value = club;
                option.text = club;
                clubsSelect.appendChild(option);
            });
        }
    }
</script>