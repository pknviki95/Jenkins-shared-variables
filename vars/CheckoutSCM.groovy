def call (Map git_variable = [:])
{
  git branch:"${git_variable.branch}",url:"${git_variable.url}"
}
