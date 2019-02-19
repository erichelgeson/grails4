package four

class MailController {

	def mailService

	def index() {
		mailService.sendMail {
			to "fred@gmail.com", "ginger@gmail.com"
			from "john@gmail.com"
			cc "marge@gmail.com", "ed@gmail.com"
			bcc "joe@gmail.com"
			subject "Hello John"
			text 'this is some text'
		}
		render('ok')
	}
}