<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Blood Link</title>
  <link rel="stylesheet" href="${url.resourcesPath}/css/login.css">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="${url.resourcesPath}/js/script.js"></script>
</head>
<body>
  <div class="login-section">
    <div id="login-heading-section">
        <h1 class="headings">Blood <span>Link</span></h1>
        <h2 class="sub-headings" > Connecting Lives, One Donation at a Time</h2>
    </div>

    <form action="${url.loginAction}" method="post" class="form-container">
      <div class="login-input-container">
        <div class="input-container">
          <label>Email or Username</label>
          <div class="input-style">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope" viewBox="0 0 16 16">
              <path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1zm13 2.383-4.708 2.825L15 11.105zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741M1 11.105l4.708-2.897L1 5.383z"/>
            </svg>
            <input id="username" type="text" name="username" autofocus>
          </div>
        </div>

        <div class="input-container">
          <label>Password</label>
          <div class="input-style">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-key" viewBox="0 0 16 16">
              <path d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8m4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5"/>
              <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0"/>
            </svg>
            <input id="password" type="password" name="password">
          </div>
        </div>

        <!-- Remember Me + Forgot Password -->
        <div class="options-row">
          <#if realm.rememberMe == true>
            <label class="remember-me">
              <input id="rememberMeCheckBox" type="checkbox" name="rememberMe"
                     <#if login.rememberMe?? && login.rememberMe>checked</#if>>
              Remember me
            </label>
          </#if>

          <#if realm.resetPasswordAllowed?? && realm.resetPasswordAllowed>
            <a href="${url.loginResetCredentialsUrl}" class="forgot-password">Forgot password?</a>
          </#if>
        </div>
      </div>

      <button id="login-button" type="submit">${msg("Log In")!''}</button>
    </form>

    <!-- Registration Link -->
    <div style="margin-top: 10px" id="registrationLink" >
      <#if realm.registrationAllowed?? && realm.registrationAllowed>
        <p>Don't have an account?
          <a href="${url.registrationUrl}">Sign up</a>
        </p>
      </#if>
    </div>

    <!-- Social Login Section -->
    <#if social.providers?? && social.providers?size gt 0>
      <div class="social-login">
        <h3>Or sign in with</h3>
        <#list social.providers as provider>
          <form action="${provider.loginUrl}" method="post">
            <button type="submit">${provider.displayName}</button>
          </form>
        </#list>
      </div>
    </#if>
  </div>
</body>
</html>
