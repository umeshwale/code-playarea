# 1. Codebase

One codebase tracked in revision control, many deploys

We should always make use of code repo.  A copy of the revision tracking database is known as a code repository, 
often shortened to code repo or just repo.
A twelve-factor app is always tracked in a version control system, such as Git, Mercurial, or Subversion. 

There is always a one-to-one correlation between the codebase and the app

   ![One Codebase](https://github.com/umeshwale/code-playarea/blob/master/microservices/12FactorApps/codebase1-good.JPG)
      
And it should not have multiple code bases for one app as below 

  ![Bad](https://github.com/umeshwale/code-playarea/blob/master/microservices/12FactorApps/codebase2-bad.JPG)

And as mentioned above there should be always one-to-one relation between codebase and the app

  ![Bad](https://github.com/umeshwale/code-playarea/blob/master/microservices/12FactorApps/codebase3-bad.JPG)
  
There is only one codebase per app, but there will be many deploys of the app. A deploy is a running instance of the app. 
This is typically a production site, and one or more staging sites. Additionally, every developer has a copy of the app 
running in their local development environment, each of which also qualifies as a deploy.

The codebase is the same across all deploys, although different versions may be active in each deploy. 
For example, a developer has some commits not yet deployed to staging; staging has some commits not yet deployed to production.
But they all share the same codebase, thus making them identifiable as different deploys of the same app.
