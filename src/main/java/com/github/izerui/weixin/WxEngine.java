/**
 *          你他妈的想干嘛就干嘛公共许可证
 *               第二版，2004年12月
 *
 * 版权所有(C) 2004 serv<liuyuhua69@gmail.com>
 *
 * 任何人都有复制与发布本协议的原始或修改过的版本的权利。
 * 若本协议被修改，须修改协议名称。
 *
 *          你他妈的想干嘛就干嘛公共许可证
 *              复制、发布和修改条款
 *
 *  0. 你只要他妈的想干嘛就干嘛好了。
 */
package com.github.izerui.weixin;

import com.github.izerui.weixin.converter.JacksonConverterFactory;
import com.github.izerui.weixin.impl.*;
import com.github.izerui.weixin.interceptor.ErrCodeInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by serv on 16/4/15.
 */
public class WxEngine {

    private Retrofit retrofit;

    private TokenService tokenService;
    private MenuService menuService;
    private GroupService groupService;
    private MessageService messageService;
    private UserService userService;
    private CommonService commonService;
    private QrcodeService qrcodeService;
    private ShortUrlService shortUrlService;
    private SemanticService semanticService;
    private MediaService mediaService;
    private IpService ipService;

    public WxEngine() {
        this(new OkHttpClient());
    }

    public WxEngine(OkHttpClient client) {
        OkHttpClient newClient = client.newBuilder().addInterceptor(new ErrCodeInterceptor()).build();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.weixin.qq.com/cgi-bin/")
                .client(newClient)
                .addConverterFactory(JacksonConverterFactory.create()).build();
        init();
    }

    private void init() {
        tokenService = new TokenServiceImpl(retrofit);
        menuService = new MenuServiceImpl(retrofit);
        groupService = new GroupServiceImpl(retrofit);
        messageService = new MessageServiceImpl(retrofit);
        userService = new UserServiceImpl(retrofit);
        commonService = new CommonServiceImpl(retrofit);
        qrcodeService = new QrcodeServiceImpl(retrofit);
        shortUrlService = new ShortUrlServiceImpl(retrofit);
        semanticService = new SemanticServiceImpl(retrofit);
        mediaService = new MediaServiceImpl(retrofit);
        ipService = new IpServiceImpl(retrofit);
    }

    public TokenService getTokenService() {
        return tokenService;
    }

    public MenuService getMenuService(String accessToken) {
        return ((ServiceImpl<?>) menuService).setAccessToken(accessToken);
    }

    public GroupService getGroupService(String accessToken) {
        return ((ServiceImpl<?>) groupService).setAccessToken(accessToken);
    }

    public MessageService getMessageService(String accessToken) {
        return ((ServiceImpl<?>) messageService).setAccessToken(accessToken);
    }

    public UserService getUserService(String accessToken) {
        return ((ServiceImpl<?>) userService).setAccessToken(accessToken);
    }

    public CommonService getCommonService() {
        return commonService;
    }

    public QrcodeService getQrcodeService(String accessToken) {
        return ((ServiceImpl<?>) qrcodeService).setAccessToken(accessToken);
    }

    public ShortUrlService getShortUrlService(String accessToken) {
        return ((ServiceImpl<?>) shortUrlService).setAccessToken(accessToken);
    }

    public SemanticService getSemanticService(String accessToken) {
        return ((ServiceImpl<?>) semanticService).setAccessToken(accessToken);
    }

    public MediaService getMediaService(String accessToken) {
        return ((ServiceImpl<?>) mediaService).setAccessToken(accessToken);
    }

    public IpService getIpService(String accessToken){
        return ((ServiceImpl<?>)ipService).setAccessToken(accessToken);
    }
}
