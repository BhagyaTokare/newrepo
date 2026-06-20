package com.hiideals.form



import grails.test.mixin.*
import spock.lang.*

@TestFor(DownloadCertificateController)
@Mock(DownloadCertificate)
class DownloadCertificateControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.downloadCertificateInstanceList
            model.downloadCertificateInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.downloadCertificateInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def downloadCertificate = new DownloadCertificate()
            downloadCertificate.validate()
            controller.save(downloadCertificate)

        then:"The create view is rendered again with the correct model"
            model.downloadCertificateInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            downloadCertificate = new DownloadCertificate(params)

            controller.save(downloadCertificate)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/downloadCertificate/show/1'
            controller.flash.message != null
            DownloadCertificate.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def downloadCertificate = new DownloadCertificate(params)
            controller.show(downloadCertificate)

        then:"A model is populated containing the domain instance"
            model.downloadCertificateInstance == downloadCertificate
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def downloadCertificate = new DownloadCertificate(params)
            controller.edit(downloadCertificate)

        then:"A model is populated containing the domain instance"
            model.downloadCertificateInstance == downloadCertificate
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/downloadCertificate/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def downloadCertificate = new DownloadCertificate()
            downloadCertificate.validate()
            controller.update(downloadCertificate)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.downloadCertificateInstance == downloadCertificate

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            downloadCertificate = new DownloadCertificate(params).save(flush: true)
            controller.update(downloadCertificate)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/downloadCertificate/show/$downloadCertificate.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/downloadCertificate/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def downloadCertificate = new DownloadCertificate(params).save(flush: true)

        then:"It exists"
            DownloadCertificate.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(downloadCertificate)

        then:"The instance is deleted"
            DownloadCertificate.count() == 0
            response.redirectedUrl == '/downloadCertificate/index'
            flash.message != null
    }
}
