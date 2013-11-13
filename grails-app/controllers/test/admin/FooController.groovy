package test.admin

class FooController {

	static namespace = 'admin'

	def afterInterceptor = { model, modelAndView ->
		println "Current view is $model ${modelAndView.viewName}"
		
		if (modelAndView.viewName.contains('index')) {
			modelAndView.viewName = "/admin/index"
		}

		println "View is now ${modelAndView.viewName}"
	}


	

	def index() { }
}
