package utils;

/**
 * Created by Ken on 2015/11/16.
 */
public interface Constants {

    interface URL{
        /**
         * Home的URL
         */
        String CITY_SELECT_URL = "";
        String ORDER_HOMEPAGE_ALL = "http://mp.elong.com/mobilepromotion/hoteldata/?cityDataId=32690&callback=b&dataSourceId=1006&t=1448253146318&callback=jsonp2";
    }

    interface BUNDLE_KEY{
        String CITY_OBJ_NAME = "city_obj";
        String CITY_NAME_KEY = "cityname";
        String CITY_ID_KEY = "cityid";
        String FRAGMENT_NAV_DATA = "nav_data";
    }

}
