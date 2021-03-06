#namespace("product_sku")

  #sql("findByProduct_sku_id")
    SELECT
    *
    FROM table_product_sku
    WHERE system_status = 1
    AND product_sku_id = #p(product_sku_id)
  #end

  #sql("save")
    INSERT INTO table_product_sku (
      product_sku_id,
      product_id,
      product_sku_is_default,
      system_create_user_id,
      system_create_time,
      system_update_user_id,
      system_update_time,
      system_version,
      system_status
    ) VALUES (
      #p(product_sku_id),
      #p(product_id),
      #p(product_sku_is_default),
      #p(system_create_user_id),
      #p(system_create_time),
      #p(system_update_user_id),
      #p(system_update_time),
      #p(system_version),
      #p(system_status)
    )
  #end

  #sql("update")
    UPDATE table_product_sku SET
    product_id = #p(product_id),
    product_sku_is_default = #p(product_sku_is_default),
    system_update_user_id = #p(system_update_user_id),
    system_update_time = #p(system_update_time),
    system_version = system_version + 1
    WHERE system_status = 1
    AND product_sku_id = #p(product_sku_id)
    AND system_version = #p(system_version)
  #end

  #sql("deleteByProduct_sku_idAndSystem_version")
    UPDATE table_product_sku SET
    system_update_user_id = #p(system_update_user_id),
    system_update_time = #p(system_update_time),
    system_version = system_version + 1,
    system_status = 0
    WHERE system_status = 1
    AND product_sku_id = #p(product_sku_id)
    AND system_version = #p(system_version)
  #end

#end