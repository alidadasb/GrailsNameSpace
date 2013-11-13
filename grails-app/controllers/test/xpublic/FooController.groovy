package test.xpublic

class FooController {

	static namespace = 'public'

	def afterInterceptor = { model, modelAndView ->
		println "Current view is $model ${modelAndView.viewName}"
		
		if (modelAndView.viewName.contains('index')) {
			modelAndView.viewName = "/public/index"
		}

		println "View is now ${modelAndView.viewName}"
	}


    def index() { }
}
