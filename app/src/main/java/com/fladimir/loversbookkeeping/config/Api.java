package com.fladimir.loversbookkeeping.config;

/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:Api接口
 */

public class Api {
    private static final String ApiBase = "";

    /**
     * Login
     */
    //取用户数据
    public static String UserCtrl = ApiBase + "UserCtrl/s";
    //取验证码图片
    public static String getCode = ApiBase + "verifyCode/getCode";
    //登录
    public static String login = ApiBase + "UserCtrl/login";

    /**
     * 采购订单
     */
    //获取订单
    //?state=（1待付款/2待发货/3待收货/4已完成/-1已取消）
    public static String getOrder = ApiBase + "ProcurementOrderCtrl/searchProcurementOrder";
    //获取详情
    public static String getOrderDetail = ApiBase + "ProcurementOrderCtrl/getOrderDetails";//ordernumber
    //取消采购订单
    public static String nullifyr = ApiBase + "ProcurementOrderCtrl/nullify";
    //确认收货
    public static String confirmTake = ApiBase + "ProcurementOrderCtrl/confirmTake";

    /**
     * 询价
     */
    //新建询价
    public static String Inquiry_save = ApiBase + "inquirySheet/save";
    //询价单列表
    public static String Inquiry_getDatas = ApiBase + "inquirySheet/getDatas";
    //获取询价单
    public static String Inquiry_getInquiryById = ApiBase + "inquirySheet/getInquiryById?id=";
    //获取询价单的商品列表
    public static String Inquiry_getGoods = ApiBase + "inquirySheet/getGoods?isId=";
    //获取询价单商品的报价列表
    public static String Inquiry_getOffers = ApiBase + "inquirySheet/getOffersByIsId?isdId=";
    //获取询价单报价列表
    public static String Inquiry_getOffersByIsId = ApiBase + "inquirySheet/getOffersByIsId?isdId=";
    //采用报价post/offerId
    public static String Inquiry_usingOffer = ApiBase + "inquirySheet/usingOffer";
    //结束询价post/isId
    public static String Inquiry_close = ApiBase + "inquirySheet/close";
    //生成采购订单post/isId
    public static String Inquiry_generate = ApiBase + "inquirySheet/generate";
    //报价post
    public static String Inquiry_offer = ApiBase + "inquirySheet/offer";

    /**
     * 商城
     */
    public static String Mall_goods_list = ApiBase + "ProductStockCtrl/mobileProductStock";
    //获取购物车列表
    //public static String Mall_Cart_list = ApiBase + "procurementCartCtrl/getProcurementCartData";
    public static String Mall_Cart_list = ApiBase + "procurementCartCtrl/getPCartData";
    public static String Mall_Cart_list_f = ApiBase + "procurementCartCtrl/getPCCartData";
    //添加购物车
    public static String Mall_Cart_Add = ApiBase + "ProductStockCtrl/addShoppingCar";
    //删除购物车(参数:key)
    public static String Mall_Cart_Del_cart = ApiBase + "procurementCartCtrl/deleteCartProductBycartId";//删除单个商品cartId
    public static String Mall_Cart_Del_sp = ApiBase + "procurementCartCtrl/deleteCartProductBySpId";//按供应商删除supplierGid
    //修改购物车数量
    public static String Mall_Cart_Update = ApiBase + "procurementCartCtrl/updateProductNum";
    //获取适用车型
    public static String Mall_Car_Brand = ApiBase + "SupplyCtrl/asyncGetCarBrand";//(Integer parentId) //获取适用车型，通过父节点id
    //车型树二级目录
    public static String Mall_BrandList = ApiBase + "SupplyCtrl/getCarBrandList";//(Integer parentId) //    （Pagination page）

    /**
     * 购物车
     */
    //获取收货地址、收货仓库接口
    public static String Cart_Warehouse = ApiBase + "procurementCartCtrl/getWarehouse";
    //提交订单
    public static String Cart_savePOders = ApiBase + "ProcurementOrderCtrl/savePOders";
    //提交订单---新接口
    public static String Cart_createPOrders = ApiBase + "ProcurementOrderCtrl/createPOrder";
    //验证
    public static String Cart_checkMoney = ApiBase + "procurementCartCtrl/checkMoney";
    //清空购物车
    public static String Cart_emptyCart = ApiBase + "procurementCartCtrl/emptyCart";
    //备货申请
    public static String Cart_Purchase = ApiBase + "purchaseRequisitionCtrl/generatePurchaseRequisition";

    /**
     * 用户相关
     */
    //用户授信、赊账额度
    public static String User_UserInfo = ApiBase + "getUserInfo";//已使用额度/当前账期 gid
    //用户信息
    public static String User_Acount = ApiBase + "CreditAcountCtr/getCreditAcountByGid";
    //修改密码
    public static String User_Change_Pswd = ApiBase + "UserCtrl/modifyPassword";
    //修改用户信息
    public static String User_Change_UserIngo = ApiBase + "UserCtrl/saveUser";

    /**
     * 支付相关
     */
    //授信、账期支付
    public static String User_Pay_Acount = ApiBase + "CreditAcountCtr/updateUseAcount";//gid  授信：useAcount= 已使用授信额度+支付金额  账期：useAcount= 当前账期+支付金额

    /**
     * 临时采购
     */
    //接车工单
    public static String User_Purchase_Order = ApiBase + "pickUpCar/getDataByPurchase";
    //获取品牌
    public static String User_Purchase_Brand = ApiBase + "SupplyCtrl/getProductBrand";
    //供应商
    public static String User_Purchase_Supplier = ApiBase + "SupplierCtrl/searchSupplierInfo";
    //商品信息
    public static String User_Purchase_Product = ApiBase + "OutStockCtrl/searchProductInfo";
    //临时采购申请单
    public static String User_Purchase_SaveOrder = ApiBase + "OneTimePurchaseCtrl/saveOneTimePurchaseOrder";
    //临时采购--是否审批
    public static String User_Purchase_IfApply = ApiBase + "OneTimePurchaseCtrl/checkIsApplyOrNotApply";
    //临时采购--提交--不需审批
    public static String User_Purchase_NoApply = ApiBase + "OneTimePurchaseCtrl/saveOneTimePONOApply";
    //临时采购--提交--需审批
    public static String User_Purchase_Apply = ApiBase + "OneTimePurchaseCtrl/saveOneTimePOApply";
    //临时采购单列表
    public static String User_Purchase_Search = ApiBase + "OneTimePurchaseCtrl/searchOneTimeOrder";
    //临时采购--明细
    public static String USer_Purchase_DetailList = ApiBase + "ProcurementOrderCtrl/getOrderDetails";

    /**
     * 进销存
     */
    //入库--订单列表
    public static String Storage_In_Order = ApiBase + "InStockCtrl/searchInStockOrder";
    //确认入库
    public static String Storage_In_Save = ApiBase + "InStockCtrl/saveInStockOrder";
    //出库--订单列表
    public static String Storage_Out_Order = ApiBase + "OutStockCtrl/searchOutStockOrder";
    //产品库存
    public static String Storage_Product = ApiBase + "ProductStockCtrl/mobileProductStock";
    //修改产品信息
    //public static String Storage_Product_Edit = ApiBase + "ProductStockCtrl/editSalePrice";
    public static String Storage_Product_Edit = ApiBase + "ProductStockCtrl/editProductStock";
    //产品上、下架  saleFlag=1上架
    public static String Storage_Product_Flag = ApiBase + "ProductStockCtrl/updateProduct";
    //仓位
    public static String Storage_Product_WareAdd = ApiBase + "WarehouseCtrl/getWarehouseLocaton?warehouseid=";

    /**
     * 工单管理
     */
    //洗车单--列表
    public static String WashCarOrder_List = ApiBase + "washCarOrder/list";
    //洗车单--详情
    public static String WashCarOrder_Detail = ApiBase + "washCarOrder/details";
    //洗车单--新建
    public static String WashCarOrder_Save = ApiBase + "washCarOrder/save";
    //洗车单--服务项目
    public static String WashCarOrder_Server = ApiBase + "serviceItem/getDatas";
    //洗车单--查询客户
    public static String Wash_Customer_Search = ApiBase + "pickUpCar/searchCustomer";
    //洗车单--新增客户
    public static String Wash_Customer_Add = ApiBase + "Customer/quickAddCustomerInfo";
    //洗车单--服务分类
    public static String WashCarOrder_Nature = ApiBase + "serviceItemTypeInfo/getTrees";
    //洗车单--会员卡
    public static String WashCarOrder_MemberCard = ApiBase + "MemberCardCtrl/searchMemberCard";
    //洗车单--会员卡服务项目
    public static String WashCarOrder_MemberCardDetail = ApiBase + "SetmenuInfoCtrl/searchSetmenuBuy";
    //洗车单--会员卡政策
    public static String WashCarOrder_MemberPolicy = ApiBase + "MemberPolicyCtrl/searchMemberPolicy";

    //车间施工单--列表
    public static String FarmOrder_List = ApiBase + "workOrder/list";
    //车间施工单--车间
    public static String FarmOrder_Plant = ApiBase + "getPlants";
    //车间施工单--技术
    public static String FarmOrder_PlantWorker = ApiBase + "getPlantUsers?type=8";
    //车间施工单--详情()
    public static String FarmOrder_DetailList = ApiBase + "workOrder/detailList";

    //接车工单--列表
    public static String PickUpOrder_List = ApiBase + "pickUpCar/getDatas";
    //接车工单--操作--验车完工
    public static String PickUpOrder_FinishPickUpCar = ApiBase + "pickUpCar/finishPickUpCar";
    //接车工单--车型选择
    public static String PickUpOrder_CarBrand = ApiBase + "SupplyCtrl/fastSearchCarBrand";
    //接车工单--操作--车间派工--获取服务分类
    public static String PickUpOrder_AllotPlant = ApiBase + "pickUpCar/getAllotPlant";
    //接车工单--派工--获得对应车间的服务细分
    public static String PickUpOrder_GetItemService = ApiBase + "pickUpCar/getServiceItemByFixType";
    //接车工单--提交分配
    public static String PickUpOrder_GernerateWork = ApiBase + "workOrder/generateWorkOrderList";
    //接车工单--故障（查询）
    public static String PickUpOrder_FaultSearch = ApiBase + "faultTypeInfo/getDatas";
    //接车工单--故障（新增）
    public static String PickUpOrder_FaultCreat = ApiBase + "faultTypeInfo/save";
    //接车工单--故障分类
    public static String PickUpOrder_FaultInfo = ApiBase + "faultTypeInfo/getTrees";
    //服务项目--服务项目--分类
    public static String PickUpOrder_ServerItem = ApiBase + "serviceItemTypeInfo/getTreesByAddServiceItem";
    //服务项目--服务项目--查询
    public static String PickUpOrder_ServerSearch = ApiBase + "serviceItem/getDatas";
    //服务项目--服务项目--新增
    public static String PickUpOrder_ServerCreat = ApiBase + "serviceItem/save";
    //服务项目--服务项目--客户确认
    public static String PickUpOrder_ServerConfirm = ApiBase + "pickUpCar/customerConfirm";
    //服务项目--用料--查询
    public static String PickUpOrder_Stock = ApiBase + "pickUpCar/searchStockProduct";
    //服务项目--用料--客户确认
    public static String PickUpOrder_StockConfirm = ApiBase + "pickUpCar/customerConfirmMaterial";
    //服务项目--用料--领料
    public static String PickUpOrder_StockConGet = ApiBase + "pickUpCar/getMaterial";
    //保存工单
    public static String PickUpOrder_SaveOrder = ApiBase + "pickUpCar/save";
    //工单信息查询 flag(fault/material/serviceItem) pickUpCarId
    public static String PickUpOrder_OrderInfos = ApiBase + "pickUpCar/getItemDatas";
    //账单信息
    public static String PickUpOrder_CaseInfos = ApiBase + "RevenueCtrl/searchGatheringOrder";
    //新建收款单--收款
    public static String PickUpOrder_Case_Save_Ga = ApiBase + "RevenueCtrl/saveGatheringOrder";
    //新建收款单--挂账
    public static String PickUpOrder_Case_Save = ApiBase + "RevenueCtrl/saveOrder";

    /**
     * 客户管理
     */
    //客户--列表
    public static String Customer_List = ApiBase + "Customer/searchCustomer";
    //客户--删除
    public static String Customer_Del = ApiBase + "Customer/deleteCustomer";
    //客户--保存
    public static String Customer_Save = ApiBase + "Customer/saveCustomer";
    //车辆--列表
    public static String Vehicle_List = ApiBase + "Vehicle/searchVehicle";
    //车辆--新建/更新
    public static String Vehicle_Save = ApiBase + "Vehicle/saveVehicle";
    //车辆--删除
    public static String Vehicle_Del = ApiBase + "Vehicle/deleteVehicle";
    //联系人--列表
    public static String Contact_List = ApiBase + "LinkerCtrl/searchLinker";
    //联系人--删除
    public static String Contact_Del = ApiBase + "LinkerCtrl/deleteLinker";
    //联系人--新建/更新
    public static String Contact_Save = ApiBase + "LinkerCtrl/saveLinker";

    /**
     * 特殊接口
     */
    //车牌
    public static String AliApi_plate = "http://jisucpsb.market.alicloudapi.com/licenseplaterecognition/recognize";
    //行驶证
    public static String AliApi_Vehicle = "https://dm-53.data.aliyun.com/rest/160601/ocr/ocr_vehicle.json";
    public static final String Ali_AppCode = "80e3730ebf2b4e3ca5e5f05de1756b94";
}
