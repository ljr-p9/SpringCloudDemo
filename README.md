# SpringCloudDemo

地址：https://github.com/ljr-p9/SpringCloudDemo.git

springcloud学习搭建案例

git推送教程
git init
git add .
git commit -m “Repo_name”
git remote add origin https://github.com/ljr-p9/SpringCloudDemo.git
git push -u origin master

git完成推送教程
git init
git add README.md
git config --global user.email "you@example.com" （可以去掉--global）
git config --global user.name "Your Name" （可以去掉--global）
git commit -m "first commit for your repo"
git status
git remote add origin https://github.com/{youre_account}/{youre_repo}.git
git push -u origin master

推送报错解决unable to access ‘https://github.com/xxx/xxx.git/‘: OpenSSL SSL_read: Connection was reset, errno
解决办法：git config --global http.sslVerify "false"


