class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "mainPage")
        "500"(view: '/error')

        "/Super@dm!n"(controller: 'superadmin', action: 'index')
        "/Dashboard"(controller: 'superadmin', action: 'indexx')
        "/register"(controller: 'register', action: 'index')
        "/Usercreates"(controller: 'usercreate', action: 'index')
        "/CommanUsers"(controller: 'commanUsers', action: 'index')
        "/Commansignup"(controller: 'register', action: 'signup')
        "/CommanUserscreates"(controller: 'superadmin', action: 'dashboard')

        "/thankyou"(controller: 'certificate', action: 'thankyou')
        "/DownloadCertificatethankyou"(controller: 'downloadCertificate', action: 'thankyou')

        "/Usercreatesindex"(controller: 'usercreate', action: 'index')

        "/Certificate"(controller: 'internationalCertificate', action: 'index')
        "/Certificatecreate"(controller: 'internationalCertificate', action: 'create')
        "/Certificateedit"(controller: 'internationalCertificate', action: 'edit')
        "/Certificateshow"(controller: 'internationalCertificate', action: 'show')
        "/Certificatereport"(controller: 'internationalCertificate', action: 'report')
        "/Certificateadminindex"(controller: 'internationalCertificate', action: 'adminindex')
        "/Certificatedownloadfile"(controller: 'internationalCertificate', action: 'downloadfile')
        "/Certificatepdf/$id"(controller: 'internationalCertificate', action: 'downloadPdf') // New mapping for PDF download
        "/AlresdyReg"(controller: 'internationalCertificate', action: 'errorPage')

        "/userlist"(controller: 'formDetail', action: 'userlist')
        "/createEducations"(controller: 'formDetail', action: 'createEducations')
        "/createAddmore"(controller: 'formDetail', action: 'createAddmore')
        "/createdocumentss"(controller: 'formDetail', action: 'createdocumentss')

        "/Downloadcertificate"(controller: 'downloadCertificate', action: 'index')
        "/DownloadCertificatecreate"(controller: 'downloadCertificate', action: 'create')
        "/DownloadCertificateedit"(controller: 'downloadCertificate', action: 'edit')
        "/DownloadCertificateshow"(controller: 'downloadCertificate', action: 'show')
        "/NotRegistered"(controller: 'downloadCertificate', action: 'errorPage')

        "/e-Pass"(controller: 'internationalCertificate', action: 'create')
        "/unusedOPT"(controller: 'formDetail', action: 'unusedOPT')
    }
}
