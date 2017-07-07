public class CreditMarketApplication extends ResourceConfig {

    public CreditMarketApplication() {
        packages(HomeResource.class.getPackage().getName(),
                 AuthApiResource.class.getPackage().getName(),
                 HomeApiResource.class.getPackage().getName());
        register(JspMvcFeature.class);
        register(JacksonFeature.class);
        register(MultiPartFeature.class);
    }
}