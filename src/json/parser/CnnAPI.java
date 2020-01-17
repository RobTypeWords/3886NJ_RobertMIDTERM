package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {       // Make main here
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

            // Api key place here
    String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=d0330e1345de4761a5b63320e25e7636";
    NewsDataModel News = null;
    List<NewsDataModel> List1 = new ArrayList<NewsDataModel>();

    URL url;

    {
        try {
            url = new URL(sURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    URLConnection request;
    {
        try {
            request = url.openConnection();
            request.connect();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


            //Json object with exceptions catch
    JsonArray jsonArray = null;
    JsonParser jp = new JsonParser();
    JsonElement root;

    {
        try {
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            if (root instanceof JsonObject) {
                JsonObject rootObj = root.getAsJsonObject();
            } else if (root instanceof JsonArray) {
                jsonArray =  root.getAsJsonArray();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// Next



}
