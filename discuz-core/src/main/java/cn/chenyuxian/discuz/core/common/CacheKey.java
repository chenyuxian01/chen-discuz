package cn.chenyuxian.discuz.core.common;

public final class CacheKey {

	/**
	 * 微信相关重复登录加锁
	 */
	public static final String WECHAT_FILE_LOCK = "wechat_file_lock:";

	/**
	 * 容器全局变量
	 */
	public static final String APP_CACHE = "APP_CACHE";

	/**
	 * 记录首页各个分类的数据缓存
	 */
	public static final String LIST_THREAD_HOME_INDEX = "list_thread_home_index_";

	/**
	 * 记录各个缓存的key值，便于数据更新的时候删除
	 */
	public static final String LIST_THREAD_KEYS = "list_thread_keys";

	/**
	 * 记录
	 */
	public static final String THREAD_RESOURCE_BY_ID = "thread_resource_by_id_";

	public static final String POST_RESOURCE_BY_ID = "post_resource_by_id_";

	/**
	 * 记录用户是否新注册用户
	 */
	public static final String NEW_USER_LOGIN = "new_user_login_";

	/**
	 * 符合智能排序条件的id数组
	 */
	public static final String LIST_SEQUENCE_THREAD_INDEX = "list_sequences_thread_index";

	public static final String LIST_SEQUENCE_THREAD_INDEX_KEYS = "list_sequences_thread_index_keys";

	public static final String API_FREQUENCE = "api_frequence";

	public static final String LIST_CATEGORIES = "list_categories";

	public static final String LIST_V2_THREADS = "list_v2_threads";

	/**
	 * 存储小程序通知模板数据
	 */
	public static final String NOTICE_MINI_PROGRAM_TEMPLATES = "notice_mini_program_templates";
	
	public static final String AUTH_USER_PREFIX = "auth_user_";

	public static final String CHECK_PAID_GROUP = "check_paid_group_";

	public static final String SETTINGS = "settings";

	public static final String CATEGORIES = "categories";

	public static final String LIST_EMOJI = "list_emoji";

	public static final String LIST_GROUPS = "list_groups";

	public static final String GROUP_PERMISSIONS = "group_permissions";

	public static final String SEQUENCE = "sequence";

	/**
	 * 默认的创建时间降序
	 */
	public static final String LIST_THREADS_V3_CREATE_TIME = "list_threads_v3_create_time";// filterId->pageId

	/**
	 * 智能排序，不参与筛选
	 */
	public static final String LIST_THREADS_V3_SEQUENCE = "list_threads_v3_sequence";// filterId->pageId

	/**
	 * 浏览数排序
	 */
	public static final String LIST_THREADS_V3_VIEW_COUNT = "list_threads_v3_view_count";// filterId->pageId

	/**
	 * 评论时间排序
	 */
	public static final String LIST_THREADS_V3_POST_TIME = "list_threads_v3_post_time";// filterId->pageId

	/**
	 * 关注排序
	 */
	public static final String LIST_THREADS_V3_ATTENTION = "list_threads_v3_attention";// filterId->pageId

	/**
	 * 个人中心复合数据排序
	 */
	public static final String LIST_THREADS_V3_COMPLEX = "list_threads_v3_complex";// filterId->pageId

	/**
	 * 发帖用户存储 id
	 */
	public static final String LIST_THREADS_V3_USERS = "list_threads_v3_users";

	/**
	 * 帖子数据存储 id
	 */
	public static final String LIST_THREADS_V3_THREADS = "list_threads_v3_threads";

	/**
	 * 帖子附件数据存储 id
	 */
	public static final String LIST_THREADS_V3_ATTACHMENT = "list_threads_v3_attachment";

	/**
	 * 帖子视频文件存储 id
	 */
	public static final String LIST_THREADS_V3_VIDEO = "list_threads_v3_video";

	/**
	 * 帖子标签存储 thread_id
	 */
	public static final String LIST_THREADS_V3_TAGS = "list_threads_v3_tags";

	/**
	 * 帖子插件存储 thread_id
	 */
	public static final String LIST_THREADS_V3_TOMS = "list_threads_v3_toms";

	/**
	 * 用户组 user_id
	 */
	public static final String LIST_THREADS_V3_GROUP_USER = "list_threads_v3_group_user";

	/**
	 * 替换标签、话题和艾特
	 */
	public static final String LIST_THREADS_V3_SEARCH_REPLACE = "list_threads_v3_search_replace";

	/**
	 * 帖子卡面底部的点赞支付摘要 thread_id
	 */
	public static final String LIST_THREADS_V3_POST_USERS = "list_threads_v3_post_users";

	/**
	 * 帖子正文数据存储 thread_id,【碎片化多文件存储】--切分成20个缓存文件
	 */
	public static final String LIST_THREADS_V3_POSTS = "list_threads_v3_posts:";

	/**
	 * 用户付费贴订单信息 user_id->thread_id
	 */
	public static final String LIST_THREADS_V3_USER_PAY_ORDERS = "list_threads_v3_user_pay_orders:";
																									
	/**
	 * 打赏的订单信息 user_id->thead_id
	 */
	public static final String LIST_THREADS_V3_USER_REWARD_ORDERS = "list_threads_v3_user_reward_orders:";
																											
	/**
	 * 是否点赞 user_id->post_id
	 */
	public static final String LIST_THREADS_V3_POST_LIKED = "list_threads_v3_post_liked:";
	
	/**
	 * 是否收藏 user_id->post_id
	 */
	public static final String LIST_THREADS_V3_THREAD_USERS = "list_threads_v3_thread_users:";

	/**
	 * 监听系统定时任务是否启动
	 */
	public static final String MONITOR_SYSTEM_TASK = "monitor_system_task:";

}
