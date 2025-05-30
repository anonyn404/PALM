import smtplib, os
from email.mime.text import MIMEText
from email.header import Header
 
def send_email(content='test email auto sender'):
    mail_host=os.getenv("EMAIL_HOST")
    mail_user=os.getenv("EMAIL_USER")
    mail_pass=os.getenv("EMAIL_PASSWORD")
    mail_to_user=os.getenv("EMAIL_TO_USER")

 
    from_addr = mail_user
    to_addr = mail_to_user
 
    try:
        server = smtplib.SMTP(mail_host, 587)
        server.ehlo()
        server.starttls()  
        server.ehlo()      
        server.login(mail_user, mail_pass) 
        server.sendmail(from_addr, to_addr, content)
        server.quit()
    except smtplib.SMTPException as e:
        print(f"Error: {e}")
        print("error when sending email")
    

if __name__ == "__main__":
    send_email("test email auto sender")