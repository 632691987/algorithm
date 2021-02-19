package algorithm.hybris;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareExtensions {

    @Test
    public void test1() {

        List<String> onRepo = new ArrayList<>();
        List<String> onTemplate = new ArrayList<>();


        onRepo.add("adaptivesearchsolr");
        onRepo.add("adaptivesearchbackoffice");
        onRepo.add("adaptivesearchsamplesaddon");
        onRepo.add("adaptivesearchwebservices");
        onRepo.add("commerceservicesbackoffice");
        onRepo.add("solrfacetsearchbackoffice");
        onRepo.add("solrserver");
        onRepo.add("yacceleratorbackoffice");
        onRepo.add("yacceleratorinitialdata");
        onRepo.add("yacceleratorfulfilmentprocess");
        onRepo.add("yacceleratorstorefront");
        onRepo.add("ycommercewebservices");
        onRepo.add("ycommercewebservicestest");
        onRepo.add("electronicsstore");
        onRepo.add("apparelstore");
        onRepo.add("captchaaddon");
        onRepo.add("acceleratorwebservicesaddon");
        onRepo.add("commerceorgsamplesaddon");
        onRepo.add("orderselfserviceaddon");
        onRepo.add("rulebuilderbackoffice");
        onRepo.add("couponbackoffice");
        onRepo.add("droolsruleengineservices");
        onRepo.add("couponfacades");
        onRepo.add("couponservices");
        onRepo.add("promotionenginesamplesaddon");
        onRepo.add("assistedservicestorefront");
        onRepo.add("assistedservicewebservices");
        onRepo.add("assistedserviceyprofileaddon");
        onRepo.add("assistedservicecustomerinterestsaddon");
        onRepo.add("assistedservicepromotionaddon");
        onRepo.add("customerticketingaddon");
        onRepo.add("customersupportbackoffice");
        onRepo.add("profiletagaddon");
        onRepo.add("profileservices");
        onRepo.add("textfieldconfiguratortemplatebackoffice");
        onRepo.add("textfieldconfiguratortemplateaddon");
        onRepo.add("cmswebservices");
        onRepo.add("smarteditwebservices");
        onRepo.add("cmssmarteditwebservices");
        onRepo.add("permissionswebservices");
        onRepo.add("smarteditaddon");
        onRepo.add("cmssmartedit");
        onRepo.add("cmsbackoffice");
        onRepo.add("cmsoccaddon");
        onRepo.add("consignmenttrackingaddon");
        onRepo.add("consignmenttrackingmock");
        onRepo.add("consignmenttrackingbackoffice");
        onRepo.add("notificationaddon");
        onRepo.add("customerinterestsaddon");
        onRepo.add("stocknotificationaddon");
        onRepo.add("configurablebundleaddon");
        onRepo.add("previewpersonalizationweb");
        onRepo.add("personalizationcmsweb");
        onRepo.add("personalizationsmartedit");
        onRepo.add("personalizationpromotionssmartedit");
        onRepo.add("personalizationsampledataaddon");
        onRepo.add("personalizationpromotionssampledataaddon");
        onRepo.add("personalizationyprofile");
        onRepo.add("personalizationpromotions");
        onRepo.add("personalizationpromotionsweb");
        onRepo.add("personalizationservicesbackoffice");
        onRepo.add("personalizationpromotionsbackoffice");
        onRepo.add("personalizationcmsbackoffice");
        onRepo.add("personalizationintegrationbackoffice");
        onRepo.add("personalizationsearchbackoffice");
        onRepo.add("personalizationsearchsmartedit");
        onRepo.add("personalizationsearchweb");
        onRepo.add("personalizationsearchsamplesaddon");
        onRepo.add("personalizationyprofilesampledataaddon");
        onRepo.add("personalizationaddon");
        onRepo.add("pcmbackofficesamplesaddon");
        onRepo.add("xyformsbackoffice");
        onRepo.add("xyformsstorefrontcommons");
        onRepo.add("xyformssamples");
        onRepo.add("xyformsweb");
        onRepo.add("platformbackoffice");
        onRepo.add("orbeonweb");
        onRepo.add("consignmenttrackingoccaddon");
        onRepo.add("customerinterestsoccaddon");
        onRepo.add("notificationoccaddon");
        onRepo.add("kymaintegrationbackoffice");
        onRepo.add("outboundservices");
        onRepo.add("outboundsync");
        onRepo.add("odata2webservices");
        onRepo.add("odata2webservicesfeaturetests");
        onRepo.add("integrationbackoffice");
        onRepo.add("integrationmonitoringbackoffice");
        onRepo.add("outboundsyncbackoffice");
        onRepo.add("merchandisingaddon");
        onRepo.add("merchandisingcmswebservices");
        onRepo.add("merchandisingsmartedit");
        onRepo.add("merchandisingservices");
        onRepo.add("merchandisingservicesbackoffice");
        onRepo.add("merchandisingstorefrontsampledataaddon");
        onRepo.add("forteraddon");
        onRepo.add("forterapidata");
        onRepo.add("forterbackoffice");
        onRepo.add("fortercore");
        onRepo.add("forterfacades");
        onRepo.add("forterfulfilmentprocess");


        onTemplate.add("adaptivesearchsolr");
        onTemplate.add("adaptivesearchbackoffice");
        onTemplate.add("adaptivesearchsamplesaddon");
        onTemplate.add("adaptivesearchwebservices");
        onTemplate.add("b2bcommercebackoffice");
        onTemplate.add("solrfacetsearchbackoffice");
        onTemplate.add("yacceleratorbackoffice");
        onTemplate.add("yacceleratorinitialdata");
        onTemplate.add("yacceleratorfulfilmentprocess");
        onTemplate.add("ycommercewebservices");
        onTemplate.add("orderselfserviceaddon");
        onTemplate.add("powertoolsstore");
        onTemplate.add("solrserver");
        onTemplate.add("acceleratorwebservicesaddon");
        onTemplate.add("b2bacceleratoraddon");
        onTemplate.add("commerceorgsamplesaddon");
        onTemplate.add("b2bpunchoutaddon");
        onTemplate.add("secureportaladdon");
        onTemplate.add("savedorderformsoccaddon");
        onTemplate.add("b2boccaddon");
        onTemplate.add("accountsummaryaddon");
        onTemplate.add("assistedservicestorefront");
        onTemplate.add("assistedservicewebservices");
        onTemplate.add("captchaaddon");
        onTemplate.add("customerticketingaddon");
        onTemplate.add("customersupportbackoffice");
        onTemplate.add("rulebuilderbackoffice");
        onTemplate.add("couponbackoffice");
        onTemplate.add("droolsruleengineservices");
        onTemplate.add("couponfacades");
        onTemplate.add("couponservices");
        onTemplate.add("promotionenginesamplesaddon");
        onTemplate.add("textfieldconfiguratortemplatebackoffice");
        onTemplate.add("textfieldconfiguratortemplateaddon");
        onTemplate.add("cmswebservices");
        onTemplate.add("smarteditwebservices");
        onTemplate.add("permissionswebservices");
        onTemplate.add("smarteditaddon");
        onTemplate.add("cmssmartedit");
        onTemplate.add("cmsbackoffice");
        onTemplate.add("previewwebservices");
        onTemplate.add("cmssmarteditwebservices");
        onTemplate.add("cmsoccaddon");
        onTemplate.add("previewpersonalizationweb");
        onTemplate.add("personalizationcmsweb");
        onTemplate.add("personalizationsmartedit");
        onTemplate.add("personalizationpromotionssmartedit");
        onTemplate.add("personalizationsampledataaddon");
        onTemplate.add("personalizationpromotionssampledataaddon");
        onTemplate.add("personalizationpromotions");
        onTemplate.add("personalizationpromotionsweb");
        onTemplate.add("personalizationservicesbackoffice");
        onTemplate.add("personalizationpromotionsbackoffice");
        onTemplate.add("personalizationcmsbackoffice");
        onTemplate.add("personalizationsearchbackoffice");
        onTemplate.add("personalizationsearchsmartedit");
        onTemplate.add("personalizationsearchweb");
        onTemplate.add("personalizationsearchsamplesaddon");
        onTemplate.add("consignmenttrackingaddon");
        onTemplate.add("consignmenttrackingmock");
        onTemplate.add("consignmenttrackingbackoffice");
        onTemplate.add("pcmbackofficesamplesaddon");
        onTemplate.add("configurablebundleaddon");
        onTemplate.add("consignmenttrackingoccaddon");
        onTemplate.add("outboundservices");
        onTemplate.add("odata2webservices");
        onTemplate.add("odata2webservicesfeaturetests");
        onTemplate.add("kymaintegrationbackoffice");
        onTemplate.add("yb2bacceleratorstorefront");

        List<String> result = filterLeftFromRight(onTemplate, onRepo);
        result.forEach(System.out::println);
    }

    // 显示左边有但是右边没有的
    public List<String> filterLeftFromRight(List<String> left, List<String> right) {
        for (String value: right) {
            left.remove(value);
        }
        return left;
    }


}
